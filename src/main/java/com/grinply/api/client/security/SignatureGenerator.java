package com.grinply.api.client.security;

public interface SignatureGenerator {
    String auth(String payload);
}
