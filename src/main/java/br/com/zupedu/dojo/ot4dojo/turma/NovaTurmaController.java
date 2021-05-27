package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zupacademy.proposta.novaproposta.Proposta;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/turmas")
public class NovaTurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;

	
	private ResponseEntity<?> turmaIniciadaOutraTurma(@RequestBody @Valid  TurmaRequest request,
													  UriComponentsBuilder builder) {
		Optional<Turma> verificaTurmaUnica = turmaRepository.findByNome(request.getNome());
		Turma turma = request.paraTurma();
		
		if (verificaTurmaUnica.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		
		if(turmaRepository.existsByIniciaEm(turma.getIniciaEm())) {
			return ResponseEntity.badRequest().build();
		}

		turmaRepository.save(turma);
		URI Location = builder.path("/turmas/{id}").buildAndExpand(turma.getId()).toUri();

		return null;
		
	}

}
