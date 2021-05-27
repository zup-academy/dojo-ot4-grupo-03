package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface TurmaRepository extends JpaRepository<Turma, Long>{
    boolean existsByIniciaEm(LocalDate iniciaEm);

}
