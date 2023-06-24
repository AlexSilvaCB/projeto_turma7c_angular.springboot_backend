package silvacb.alex.turma7C.DTO;

import silvacb.alex.turma7C.entidades.Formulario;

public class FormularioDTO {
	
	private Long id;
	private String nome;
	private String turma;
	private String nickname;
	private String descricao;
	private String descricao2;
	
	public FormularioDTO() {
	}
	
	public FormularioDTO(Formulario formulario) {
		id = formulario.getId();
		nome = formulario.getNome();
		turma = formulario.getTurma();
		nickname = formulario.getNickname();
		descricao = formulario.getDescricao();
		descricao2 = formulario.getDescricao2();
	}

	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTurma() {
		return turma;
	}
	public String getNickname() {
		return nickname;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getDescricao2() {
		return descricao2;
	}
	
}
