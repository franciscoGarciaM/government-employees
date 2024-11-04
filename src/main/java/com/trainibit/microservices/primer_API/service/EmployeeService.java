package com.trainibit.microservices.primer_API.service;

import com.trainibit.microservices.primer_API.dto.request.EmployeeRequest;
import com.trainibit.microservices.primer_API.dto.response.EmployeeResponse;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    List<EmployeeResponse> buscarTodos();
    EmployeeResponse save(EmployeeRequest employeeRequest);
    EmployeeResponse getById(Long id);
    EmployeeResponse getByUuid(UUID uuid);
    EmployeeResponse update(UUID uuid, EmployeeRequest employeeRequest);
    void delete(UUID uuid);
}
