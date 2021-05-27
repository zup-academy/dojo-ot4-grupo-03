package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Length(max = 50)
	@Size(max=50)
	private String nome;
	@Column(unique = true)
	private LocalDate iniciaEm;
	private LocalDate terminaEm;

	public Turma(String nome, LocalDate iniciaEm, LocalDate finalizaEm) {
	}


	public Long getId() {
	return id;	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}


	public String getNome() {
		return nome;
	}


	
}
