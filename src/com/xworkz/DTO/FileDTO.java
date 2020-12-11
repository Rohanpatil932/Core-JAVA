package com.xworkz.DTO;

import java.util.Date;

public class FileDTO {
	private String name;
	private float size;
	private String location;
	private String type;
	private Date CreateDate;

	public FileDTO() {
		System.out.println("Default Constructor");

	}

	public FileDTO(String name, String type) {
		System.out.println("Second fileDTO ");
		this.name = name;
		this.type = type;
	}

	public FileDTO(String name, float size, String location, String type, Date createDate) {
		super();
		this.name = name;
		this.size = size;
		this.location = location;
		this.type = type;
		CreateDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

}
