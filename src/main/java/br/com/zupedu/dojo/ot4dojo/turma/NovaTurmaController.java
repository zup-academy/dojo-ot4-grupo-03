package br.com.zupedu.dojo.ot4dojo.turma;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/turmas")
public class NovaTurmaController {

	@Autowired
	private TurmaRepository turmaRepository;

	@PostMapping
	public ResponseEntity<?> turmaIniciadaOutraTurma(@RequestBody @Valid TurmaRequest request,
			UriComponentsBuilder builder) {

		Optional<Turma> verificaTurmaUnica = turmaRepository.findByNome(request.getNome());
		Turma turma = request.paraTurma();

		if (verificaTurmaUnica.isPresent()) {
			return ResponseEntity.badRequest().build();
		}

		if (turmaRepository.existsByIniciaEm(request.getIniciaEm())) {

			return ResponseEntity.badRequest().build();
		}

		turmaRepository.save(turma);
		URI Location = builder.path("/turmas/{id}").buildAndExpand(turma.getId()).toUri();

		return ResponseEntity.created(Location).build();

	}

}
