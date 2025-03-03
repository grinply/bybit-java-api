package com.grinply.api.domain.market;

import com.grinply.api.client.domain.GenericResponse;
import com.grinply.api.client.domain.market.response.serverTime.ServerTimeResult;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ServerTimeResultDeserializerTest {
    @Test
    public void testServerTimeResultDeserializer()
    {
        final String tickersResultJson = "{\n" +
                "    \"retCode\": 0,\n" +
                "    \"retMsg\": \"OK\",\n" +
                "    \"result\": {\n" +
                "        \"timeSecond\": \"1699816496\",\n" +
                "        \"timeNano\": \"1699816496197575040\"\n" +
                "    },\n" +
                "    \"retExtInfo\": {},\n" +
                "    \"time\": 1699816496197\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            GenericResponse<ServerTimeResult> response = mapper.readValue(tickersResultJson, new TypeReference<GenericResponse<ServerTimeResult>>() {
            });
            // You can now access the fields of the response
            assertEquals(response.getRetCode(), 0);
            assertEquals(response.getRetMsg(), "OK");
            // Accessing the fields of the result
            ServerTimeResult serverTimeResult = response.getResult();
            assertEquals(serverTimeResult.getTimeNano(), "1699816496197575040");
            assertEquals(serverTimeResult.getTimeSecond(), "1699816496");
        }catch (IOException e) {
            System.out.println(e.getMessage());
            fail();
        }
    }
}
