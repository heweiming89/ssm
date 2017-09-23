package cn.heweiming.ssm.mybatis.generator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.codegen.AbstractJavaGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * @author heweiming  2017年9月23日 下午5:17:25
 * @version 1.0.0
 * @description 
 */
public class GenericIntrospectedTable extends IntrospectedTableMyBatis3Impl {

    @Override
    public List<GeneratedJavaFile> getGeneratedJavaFiles() {
        List<GeneratedJavaFile> answer = new ArrayList<GeneratedJavaFile>();

        for (AbstractJavaGenerator javaGenerator : javaModelGenerators) {
            List<CompilationUnit> compilationUnits = javaGenerator.getCompilationUnits();
            for (CompilationUnit compilationUnit : compilationUnits) {
                GeneratedJavaFile gjf = new GeneratedJavaFile(compilationUnit,
                        context.getJavaModelGeneratorConfiguration().getTargetProject(),
                        context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING), context.getJavaFormatter());
                answer.add(gjf);
            }
        }

        for (AbstractJavaGenerator javaGenerator : clientGenerators) {
            List<CompilationUnit> compilationUnits = javaGenerator.getCompilationUnits();
            for (CompilationUnit compilationUnit : compilationUnits) {

                FullyQualifiedJavaType javaType = compilationUnit.getType();

                Set<FullyQualifiedJavaType> importedTypes = compilationUnit.getImportedTypes();
                Iterator<FullyQualifiedJavaType> iterator = importedTypes.iterator();
                FullyQualifiedJavaType model = iterator.next();
                FullyQualifiedJavaType example = iterator.next();

                String baseMapperPackage = "cn.heweiming.ssm.mybatis.base";
                String baseMapperName = "BaseMapper";

                String modelName = model.getShortName();
                String exampleName = example.getShortName();

                String fullTypeSpecification = String.format(baseMapperName + "<%s, %s>", modelName, exampleName);

                FullyQualifiedJavaType superInterface = new FullyQualifiedJavaType(fullTypeSpecification);
                FullyQualifiedJavaType baseMapper = new FullyQualifiedJavaType(
                        baseMapperPackage + "." + baseMapperName);

                Interface api = new Interface(javaType);
                api.setVisibility(JavaVisibility.PUBLIC);
                api.addSuperInterface(superInterface);
                api.addImportedTypes(new LinkedHashSet<>(Arrays.asList(model, example, baseMapper)));

                api.addJavaDocLine("/**");
                api.addJavaDocLine(" * @createdBy MyBatis Generator");
                api.addJavaDocLine(" * @createdDate " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                api.addJavaDocLine(" */");

                GeneratedJavaFile gjf = new GeneratedJavaFile(api,
                        context.getJavaClientGeneratorConfiguration().getTargetProject(),
                        context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING), context.getJavaFormatter());
                answer.add(gjf);
            }
        }

        return answer;
    }

}
