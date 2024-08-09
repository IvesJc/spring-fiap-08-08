package com._2tdspr.iveschiba.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    private String primeiroNome;
    private String sobrenome;
    private String documento;
}
