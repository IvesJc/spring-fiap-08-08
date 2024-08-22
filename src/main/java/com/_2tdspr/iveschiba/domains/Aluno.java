package com._2tdspr.iveschiba.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String rm;
    private String registro;

}
