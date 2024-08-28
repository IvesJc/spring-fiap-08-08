package com._2tdspr.iveschiba.gateways.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

public record AlunoPostRequestDTO(
        String id,
        String rm,
        @NotBlank
        @Length(min = 4)
        String primeiroNome,
        String sobrenome,
        String documento,
        String registro
) {
}
