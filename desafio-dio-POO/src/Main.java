import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
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
		
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);
		
	
		
	
	}

}
