package com.trainibit.microservices.primer_API.controllers;

import com.trainibit.microservices.primer_API.dto.request.SigninRequest;
import com.trainibit.microservices.primer_API.dto.response.JwtAuthenticationResponse;
import com.trainibit.microservices.primer_API.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController //anotaciones
@RequestMapping("/api/v1/auth")
public class AccessController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }

}
