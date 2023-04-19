package com.vinicius.workshop_mongodb.DTO;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AutorDTO autorDTO;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date date, AutorDTO autorDTO) {
		super();
		this.text = text;
		this.date = date;
		this.autorDTO = autorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AutorDTO getAutorDTO() {
		return autorDTO;
	}

	public void setAutorDTO(AutorDTO autorDTO) {
		this.autorDTO = autorDTO;
	}
	
	

}
