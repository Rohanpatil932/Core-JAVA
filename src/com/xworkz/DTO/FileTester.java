package com.xworkz.DTO;

import java.util.Date;

public class FileTester {
	public static void main(String[] args) {
		FileDTO file = new FileDTO();
		file.setName("xworkz");
		System.out.println(file.getName());
		Date currentDate = new Date();
		file.setCreateDate(currentDate);
		System.out.println(file.getCreateDate());

		FileDTO file1 = new FileDTO("movies", ".mp4");
		System.out.println(file1.getName());
		System.out.println(file1.getType());
		file1.setSize(242.66f);
		System.out.println(file1.getSize());

		Date date = new Date();
		FileDTO file3 = new FileDTO("images", 200.3f, "/c/folder", ".img", date);
		System.out.println(file3.getLocation());
		System.out.println(file3.getName());
		System.out.println(file3.getSize());
		System.out.println(file3.getType());
		System.out.println(file3.getCreateDate());

	}

}
