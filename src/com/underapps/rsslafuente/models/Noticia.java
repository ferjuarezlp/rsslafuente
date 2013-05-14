package com.underapps.rsslafuente.models;

import java.util.List;

public class Noticia {
	
	private String titulo;
	private String autor;
	private String link;
	private List<String> comments;
	private String pubDate;
	private List<String> categorias;
	
	
	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", autor=" + autor + ", link="
				+ link + ", pubDate=" + pubDate + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public List<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}
	
	

}
