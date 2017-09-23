package cn.heweiming.ssm.util;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author heweiming  2017年9月23日 下午5:18:23
 * @version 1.0.0
 * @description 
 */
public class ToStringUtils {

    public static String toStringForJSONStyle(Object object) {
        String jsonStr = ToStringBuilder.reflectionToString(object, ToStringStyle.JSON_STYLE);
        return jsonStr;
    }

}
