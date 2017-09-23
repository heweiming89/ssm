package cn.heweiming.ssm.web.json.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import cn.heweiming.ssm.enums.DisplayedEnum;

/**
 * @author heweiming  2017年9月23日 下午5:19:38
 * @version 1.0.0
 * @description 
 */
@SuppressWarnings("rawtypes")
public class DisplayedEnumSerializer extends JsonSerializer<DisplayedEnum> {

    @Override
    public void serialize(DisplayedEnum value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        gen.writeStartObject();
        gen.writeStringField("className", value.getClass().getSimpleName());
        gen.writeStringField("label", value.getLabel());
        gen.writeStringField("value", value.getValue());
        gen.writeEndObject();

    }

}
