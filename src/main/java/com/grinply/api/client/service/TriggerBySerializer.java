package com.grinply.api.client.service;
import com.grinply.api.client.domain.TriggerBy;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.JsonSerializer;

import java.io.IOException;
public class TriggerBySerializer extends JsonSerializer<TriggerBy> {
    @Override
    public void serialize(TriggerBy value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(value.getTrigger());
    }
}
