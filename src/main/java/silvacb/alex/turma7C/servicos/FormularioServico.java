package silvacb.alex.turma7C.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import silvacb.alex.turma7C.entidades.Formulario;
import silvacb.alex.turma7C.repositorios.FormularioRepositorio;

@Service
public class FormularioServico {
	
	@Autowired
	private FormularioRepositorio formRepositorio;
	
	@Transactional(readOnly = true)
	public List<Formulario> getAll(){
		return formRepositorio.findAll();
	}
	
	@Transactional(readOnly = true)
	public Formulario buscaId(Long id) {
		return formRepositorio.findById(id).get();
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Formulario inserir(Formulario obj) {
		return formRepositorio.save(obj);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void deleteId(Long id) {
		formRepositorio.deleteById(id);
	}
	
	

}
