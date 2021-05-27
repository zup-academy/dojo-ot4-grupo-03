package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/turmas")
public class NovaTurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;

	
	private ResponseEntity<?> turmaIniciadaOutraTurma(@RequestBody @Valid  TurmaRequest request,
													  UriComponentsBuilder builder) {

		Turma turma = request.paraTurma();


		turmaRepository.save(turma);
		URI Location = builder.path("/turmas/{id}").buildAndExpand(turma.getId()).toUri();

		return null;
		
	}

}
