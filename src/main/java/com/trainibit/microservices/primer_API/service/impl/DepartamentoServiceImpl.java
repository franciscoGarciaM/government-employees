package com.trainibit.microservices.primer_API.service.impl;

import com.trainibit.microservices.primer_API.dto.request.DepartamentoRequest;
import com.trainibit.microservices.primer_API.dto.response.DepartamentoResponse;
import com.trainibit.microservices.primer_API.entity.Departamento;
import com.trainibit.microservices.primer_API.mapper.DepartamentoMapper;
import com.trainibit.microservices.primer_API.repository.AreaRepository;
import com.trainibit.microservices.primer_API.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public DepartamentoResponse save(DepartamentoRequest departamentoRequest) {
        Departamento departamento = DepartamentoMapper.mapRequesstToEntity(departamentoRequest);
        LocalDate now = LocalDate.now();
        departamento.setCreatedDate(now);
        departamento.setUpdatedDate(now);
        departamento.setActive(true);
        return DepartamentoMapper.mapEntityToResponse(areaRepository.save(departamento));
    }
}
