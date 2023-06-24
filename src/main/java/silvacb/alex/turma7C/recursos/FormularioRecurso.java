package silvacb.alex.turma7C.recursos;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import silvacb.alex.turma7C.DTO.FormularioDTO;
import silvacb.alex.turma7C.entidades.Formulario;
import silvacb.alex.turma7C.servicos.FormularioServico;


@RestController
@RequestMapping(value = "/form")
@CrossOrigin(origins = "*")
public class FormularioRecurso {

	@Autowired
	private FormularioServico formServico;
	
	@GetMapping
	public ResponseEntity<List<FormularioDTO>> findAll(){
		List<Formulario> resultado = formServico.getAll();
		List<FormularioDTO> listDTO = resultado.stream().map(obj -> new FormularioDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FormularioDTO> findById(@PathVariable Long id){
		Formulario obj = formServico.buscaId(id);
		FormularioDTO objDTO = new FormularioDTO(obj);
		return ResponseEntity.ok().body(objDTO);
	}
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity<Formulario> insert(@RequestBody Formulario obj) {
		obj = formServico.inserir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Formulario> deleteId(@PathVariable Long id){
		formServico.deleteId(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
