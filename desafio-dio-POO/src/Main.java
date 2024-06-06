import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		Curso curso = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descricao Curso Java");
		curso.setCargaHoraria(8);
		
		mentoria.setTitulo("Mentoria 1");
		mentoria.setDescricao("Mentoria Sobre Java");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	    mentoria.setData(LocalDate.now().format(formatter));
		
		System.out.println(curso);
		System.out.println(mentoria);
	
	}

}
