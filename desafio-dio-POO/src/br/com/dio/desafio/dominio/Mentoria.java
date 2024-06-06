package br.com.dio.desafio.dominio;

public class Mentoria {

	private String titulo;
	private String descricao;
    private String data;
	
	public Mentoria() {
		
	}
	
	public Mentoria(String titulo, String descricao, String data) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Mentoria [nome=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	
	
	
}
