package com._2tdspr.iveschiba.domains;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends Pessoa{

    private String id;
    private String rm;
    private String registro;

}
