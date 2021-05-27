package br.com.zupedu.dojo.ot4dojo.turma;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import java.time.LocalDate;

public class TurmaRequest {

    @Max(value = 50)
    private String nome;
	@Column(unique = true)
    private LocalDate iniciaEm;

    private LocalDate finalizaEm;


	public TurmaRequest(@Max(50) String nome, LocalDate iniciaEm, 
			LocalDate finalizaEm) {
		super();
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.finalizaEm = finalizaEm;
	}
	
	
   
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public LocalDate getIniciaEm() {
		return iniciaEm;
	}



	public void setIniciaEm(LocalDate iniciaEm) {
		this.iniciaEm = iniciaEm;
	}



	public LocalDate getFinalizaEm() {
		return finalizaEm;
	}



	public void setFinalizaEm(LocalDate finalizaEm) {
		this.finalizaEm = finalizaEm;
	}



	public Turma paraTurma(TurmaRequest request) {
		
		this.nome = request.getNome();
		this.iniciaEm = request.getIniciaEm();
		this.finalizaEm = request.getFinalizaEm();
		
		return new Turma();
	}
}
