package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TurmaRequest {

	@Size(max=50)
    private String nome;

    @Column(unique = true)
	@NotNull
    private LocalDate iniciaEm;

    @NotNull
    private LocalDate finalizaEm;


	public TurmaRequest(String nome, LocalDate iniciaEm, 
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



	public Turma paraTurma() {
		/*this.nome = request.getNome();
		this.iniciaEm = request.getIniciaEm();
		this.finalizaEm = request.getFinalizaEm();
		*/
		return new Turma(nome, iniciaEm,finalizaEm);
	}

}
