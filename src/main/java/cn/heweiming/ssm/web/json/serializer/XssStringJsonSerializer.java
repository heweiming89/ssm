package cn.heweiming.ssm.web.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;

/**
 * @author heweiming  2017年9月23日 下午5:19:49
 * @version 1.0.0
 * @description 
 */
public class XssStringJsonSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        if (value != null) {
            gen.writeString(StringEscapeUtils.escapeHtml4(value));
        } else {
            gen.writeString("");
        }
    }

}
