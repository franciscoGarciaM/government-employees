package com.trainibit.microservices.primer_API.service;


import com.trainibit.microservices.primer_API.dto.request.SignUpRequest;
import com.trainibit.microservices.primer_API.dto.request.SigninRequest;
import com.trainibit.microservices.primer_API.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
