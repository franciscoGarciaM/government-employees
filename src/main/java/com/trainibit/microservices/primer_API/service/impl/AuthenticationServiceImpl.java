package com.trainibit.microservices.primer_API.service.impl;


import com.trainibit.microservices.primer_API.dto.request.SignUpRequest;
import com.trainibit.microservices.primer_API.dto.request.SigninRequest;
import com.trainibit.microservices.primer_API.dto.response.JwtAuthenticationResponse;
import com.trainibit.microservices.primer_API.repository.EmployeeRepository;
import com.trainibit.microservices.primer_API.service.AuthenticationService;
import com.trainibit.microservices.primer_API.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public JwtAuthenticationResponse signup(SignUpRequest request) {
//        var user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName())
//                .email(request.getEmail()).password(passwordEncoder.encode(request.getPassword()))
//                .role(Role.USER).build();
//        employeeRepository.save(user);
//        var jwt = jwtService.generateToken(user);
//        return JwtAuthenticationResponse.builder().token(jwt).build();
        return null;
    }

    @Override
    public JwtAuthenticationResponse signin(SigninRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = employeeRepository.findByEmailAddress(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
        var jwt = jwtService.generateToken(user);
        return JwtAuthenticationResponse.builder().token(jwt).build();
    }
}
