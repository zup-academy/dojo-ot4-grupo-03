package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface TurmaRepository extends JpaRepository<Turma, Long>{
    boolean existsByIniciaEm(LocalDate iniciaEm);

	Optional<Turma> findByNome(String nome);

}
