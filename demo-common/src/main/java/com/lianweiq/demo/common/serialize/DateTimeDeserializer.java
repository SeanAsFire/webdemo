package com.lianweiq.demo.common.serialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;

/**
 * User: yaohuaz Date: 2017/4/27 Time: 下午1:52
 */
public class DateTimeDeserializer extends StdScalarDeserializer<DateTime> {

    private static final long serialVersionUID = -8526618499222357132L;

    public DateTimeDeserializer() {
        super(DateTime.class);
    }

    @Override
    public DateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String s = node.asText();
        DateTime parse = DateTime.parse(s, ISODateTimeFormat.dateTimeNoMillis());
        return parse;
    }
}