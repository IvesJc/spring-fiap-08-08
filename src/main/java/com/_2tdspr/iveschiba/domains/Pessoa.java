package com._2tdspr.iveschiba.domains;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    private String primeiroNome;
    private String sobrenome;
    private String documento;
}
