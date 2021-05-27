package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;



public class TurmaResponse {
	
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate finalizaEm;


	public TurmaResponse(String nome, LocalDate iniciaEm, 
			LocalDate finalizaEm) {
		super();
		nome = getNome();
		iniciaEm = getIniciaEm();
		finalizaEm = getFinalizaEm();
	}


	public String getNome() {
		return nome;
	}


	public LocalDate getIniciaEm() {
		return iniciaEm;
	}


	public LocalDate getFinalizaEm() {
		return finalizaEm;
	}
	
}
