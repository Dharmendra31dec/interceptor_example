package com.example.interceptorexample.interceptor;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class DynamicAuthInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        String token = getAuthToken(); // Fetch from Security Service
        request.getHeaders().add("Authorization", "Bearer " + token);
        return execution.execute(request, body);
    }

    private String getAuthToken() {
        return "dynamic-token"; // Replace with real token retrieval logic
    }
}
