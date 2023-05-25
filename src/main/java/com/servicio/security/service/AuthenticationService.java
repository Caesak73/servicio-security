package com.servicio.security.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;

@Service
public class AuthenticationService {
	
	@Autowired
	private RestTemplate clienteRest;

    public String getToken() {
        String authUrl = "http://localhost:8080/token";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String requestBody = "{\"username\":\"auth-vivelibre\",\"password\":\"password\"}";
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = clienteRest.exchange(authUrl, HttpMethod.POST, requestEntity, String.class);
        String token = response.getBody(); // Obtener el token de la respuesta

        return token;
    }
}
