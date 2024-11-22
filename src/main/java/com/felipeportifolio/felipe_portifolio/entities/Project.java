package com.felipeportifolio.felipe_portifolio.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;

	@Column(length = 2000)
	private String description;
    private String url;
    private String urlImage;
    private String urlGit;
    private LocalDate date;

	public Project() {}

	public Project(Long id, String title, String description, String url, String urlImage, String urlGit, LocalDate date) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
		this.setUrlImage(urlImage);
		this.setUrlGit(urlGit);
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getUrlGit() {
		return urlGit;
	}

	public void setUrlGit(String urlGit) {
		this.urlGit = urlGit;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(id, other.id);
	}

}
