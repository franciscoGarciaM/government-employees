package com.trainibit.microservices.primer_API.service;

import com.trainibit.microservices.primer_API.dto.request.RoleRequest;
import com.trainibit.microservices.primer_API.dto.response.RoleResponse;

public interface RoleService {

    RoleResponse save(RoleRequest roleRequest);
}
