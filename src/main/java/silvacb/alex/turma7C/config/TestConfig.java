package silvacb.alex.turma7C.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import silvacb.alex.turma7C.entidades.Formulario;
import silvacb.alex.turma7C.repositorios.FormularioRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private FormularioRepositorio formRepositorio;
	
	public void run(String... args) throws Exception{
		
		
		Formulario form1 = new Formulario("Alex Green", "Turma 7C", null, "Sim", 
				"Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin "
				+ "literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney "
				+ "College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, "
				+ "and going through the cites of the word in classical literature, discovered the undoubtable source. "
				+ "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" "
				+ "(The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, "
				+ "very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from "
				+ "a line in section 1.10.32.",
				null, null);
		Formulario form2 = new Formulario("Roberto Blue", "Turma 7C",  null, "Sim", 
				"Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin "
				+ "literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney "
				+ "College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and "
				+ "going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes "
				+ "from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, "
				+ "written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. "
				+ "The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.",
				null, null);
		Formulario form3 = new Formulario("Maria Pink", "Turma 8A",  null, "Sim", 
				"Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin "
				+ "literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney "
				+ "College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, "
				+ "and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum "
				+ "comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by "
				+ "Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. "
				+ "The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.",
				null, null);
		
		formRepositorio.saveAll(Arrays.asList(form1, form2, form3));
		
	}
	
}
