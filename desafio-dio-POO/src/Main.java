import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		Curso curso = new Curso();
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descricao Curso Java");
		curso.setCargaHoraria(8);
		
		curso1.setTitulo("Curso Java Classic");
		curso1.setDescricao("Descricao Curso Java 11");
		curso1.setCargaHoraria(12);
		
		mentoria.setTitulo("Mentoria 1");
		mentoria.setDescricao("Mentoria Sobre Java");
		
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso);
		//System.out.println(mentoria);
		
	
		BootCamp boocamp = new BootCamp();
		boocamp.setNome("BootCamp Java para Iniciantes");
		boocamp.setDescricao("Curso de Java");
		boocamp.getConteudos().add(curso);
		boocamp.getConteudos().add(curso1);
		boocamp.getConteudos().add(mentoria);
		
		Dev devJonath = new Dev();
		devJonath.setNome("Jonath");
		devJonath.inscreverBootCamp(boocamp);
		System.out.println("Conteudos Inscritos : " + devJonath.getConteudosInscritos());
		
		devJonath.progredir();
		devJonath.progredir();
		System.out.println("...............................................");
		
		System.out.println("Conteudos Inscritos : " + devJonath.getConteudosInscritos());
		System.out.println("Conteudos Concluidos : " + devJonath.getConteudosConcluidos());
		System.out.println("XP:" + devJonath.calcularTotalXp());
		
		Dev devPaulo = new Dev();
		devPaulo.setNome("Paulo");
		devPaulo.inscreverBootCamp(boocamp);
		System.out.println("Conteudos Inscritos : " + devPaulo.getConteudosInscritos());
		devPaulo.progredir();
		System.out.println("...............................................");
		
		System.out.println("Conteudos Inscritos : " + devPaulo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos : " + devPaulo.getConteudosConcluidos());
		System.out.println("XP:" + devPaulo.calcularTotalXp());
	}

}
