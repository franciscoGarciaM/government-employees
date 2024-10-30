package com.trainibit.microservices.primer_API.mapper;

import com.trainibit.microservices.primer_API.dto.request.DepartamentoRequest;
import com.trainibit.microservices.primer_API.dto.response.DepartamentoResponse;
import com.trainibit.microservices.primer_API.entity.Departamento;

import java.time.LocalDate;
import java.util.UUID;

public class DepartamentoMapper {

    public static Departamento mapRequesstToEntity(DepartamentoRequest departamentoRequest) {
        Departamento area = new Departamento();
        area.setUuid(departamentoRequest.getUuid());
        return area;
    }

    public static DepartamentoResponse mapEntityToResponse(Departamento departamento) {
        DepartamentoResponse area = new DepartamentoResponse();
        area.setUuid(UUID.randomUUID());
        area.setDescription(departamento.getDescription());
        return area;
    }
}
