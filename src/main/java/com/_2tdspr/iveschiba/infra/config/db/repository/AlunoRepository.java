package com._2tdspr.iveschiba.infra.config.db.repository;

import com._2tdspr.iveschiba.domains.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,String> {
}
