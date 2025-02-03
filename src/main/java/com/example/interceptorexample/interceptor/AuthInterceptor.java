package com.example.interceptorexample.interceptor;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class AuthInterceptor implements ClientHttpRequestInterceptor{

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
	      // Modify the request (e.g., add authentication headers)
        request.getHeaders().add("Authorization", "Bearer my-secure-token");
        System.out.println("Outgoing Request AuthInterceptor: " + request.getURI());

        // Proceed with the request
        return execution.execute(request, body);
		
	}

}
