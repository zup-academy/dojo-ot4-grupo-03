package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.constraints.Max;
import java.time.LocalDate;

public class TurmaRequest {

    @Max(value = 50)
    private String nome;

    private LocalDate iniciaEm;

    private LocalDate finalizaEm;


}
