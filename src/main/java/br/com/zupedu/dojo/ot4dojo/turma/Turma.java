package br.com.zupedu.dojo.ot4dojo.turma;

import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Length(max = 50)
	private String nome;
	@Column(unique = true)
	private LocalDate iniciaEm;
	private LocalDate terminaEm;


	public Long getId() {
	return id;	}
}
