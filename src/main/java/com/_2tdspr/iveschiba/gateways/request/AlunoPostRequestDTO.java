package com._2tdspr.iveschiba.gateways.request;

public record AlunoPostRequestDTO(
        String id,
        String rm,
        String primeiroNome,
        String sobrenome,
        String documento,
        String registro
) {
}
