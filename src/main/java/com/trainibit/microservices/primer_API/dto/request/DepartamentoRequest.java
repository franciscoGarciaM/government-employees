package com.trainibit.microservices.primer_API.dto.request;

import java.time.LocalDate;
import java.util.UUID;

public class DepartamentoRequest {
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
