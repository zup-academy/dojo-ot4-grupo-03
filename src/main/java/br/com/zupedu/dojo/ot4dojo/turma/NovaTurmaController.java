package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class NovaTurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;


	private bool turmaIniciadaOutraTurma(Turma turma) {
	  
	}

}
