package silvacb.alex.turma7C.entidades;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_formulario")
public class Formulario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String turma;
	private String nickname;
	private String simOuNao;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private String simOuNao2;
	
	@Column(columnDefinition = "TEXT")
	private String descricao2;
	
	public Formulario() {
		
	}
	
	public Formulario(String nome, String turma, String nickname, String simOuNao, String descricao, String simOuNao2,
			String descricao2) {
		this.nome = nome;
		this.turma = turma;
		this.nickname = nickname;
		this.simOuNao = simOuNao;
		this.descricao = descricao;
		this.simOuNao2 = simOuNao2;
		this.descricao2 = descricao2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSimOuNao() {
		return simOuNao;
	}

	public void setSimOuNao(String simOuNao) {
		this.simOuNao = simOuNao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSimOuNao2() {
		return simOuNao2;
	}

	public void setSimOuNão2(String simOuNao2) {
		this.simOuNao2 = simOuNao2;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nickname, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formulario other = (Formulario) obj;
		return Objects.equals(id, other.id) && Objects.equals(nickname, other.nickname)
				&& Objects.equals(nome, other.nome);
	}
}
