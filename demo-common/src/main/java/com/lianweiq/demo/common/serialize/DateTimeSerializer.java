package com.lianweiq.demo.common.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;

/**
 * User: yaohuaz Date: 2017/4/27 Time: 下午1:46
 */
public class DateTimeSerializer extends StdScalarSerializer<DateTime> {

    private static final long serialVersionUID = -7762935559107903709L;

    public DateTimeSerializer() {
        super(DateTime.class);
    }

    @Override
    public void serialize(DateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider provider)
            throws IOException {
        String dateTimeAsString = dateTime.toString(ISODateTimeFormat.dateTimeNoMillis());
        jsonGenerator.writeString(dateTimeAsString);
    }
}