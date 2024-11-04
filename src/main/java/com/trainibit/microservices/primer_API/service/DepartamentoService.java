package com.trainibit.microservices.primer_API.service;

import com.trainibit.microservices.primer_API.dto.request.DepartamentoRequest;
import com.trainibit.microservices.primer_API.dto.response.DepartamentoResponse;

public interface DepartamentoService {

    DepartamentoResponse save(DepartamentoRequest departamentoRequest);
}
