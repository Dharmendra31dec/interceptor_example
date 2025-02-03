package com.example.interceptorexample.interceptor;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import java.io.IOException;

public class RetryInterceptor implements ClientHttpRequestInterceptor {
    private static final int MAX_RETRIES = 3;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        int attempt = 0;
        IOException exception;

        do {
            try {
                return execution.execute(request, body);
            } catch (IOException ex) {
                exception = ex;
                attempt++;
                System.out.println("⚠️ Retry attempt: " + attempt);
            }
        } while (attempt < MAX_RETRIES);

        throw exception;
    }
}
