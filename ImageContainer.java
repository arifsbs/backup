package com.dropwizard.client;

import java.util.List;

public class ImageContainer {

	private String title;
	private String link;
	private String description;
	private String modified;
	private String generator;
	private List<ImageEntity> items;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getGenerator() {
		return generator;
	}
	public void setGenerator(String generator) {
		this.generator = generator;
	}
	public List<ImageEntity> getItems() {
		return items;
	}
	public void setItems(List<ImageEntity> items) {
		this.items = items;
	}

	
	
}
