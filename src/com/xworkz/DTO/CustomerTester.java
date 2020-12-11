package com.xworkz.DTO;

public class CustomerTester {

	public static void main(String[] args) {
    CustomerDTO customerDTO=new CustomerDTO();
customerDTO.setContactNo(9665344007l);
System.out.println(customerDTO.getContactNo());

customerDTO.setCustomerId(2455);
System.out.println(customerDTO.getCustomerId());

customerDTO.setEmailId("ROHANPATIL932@GMAIL.COM");
System.out.println(customerDTO.getEmailId());

customerDTO.setName("rohanp");
System.out.println(customerDTO.getName());

CustomerDTO customerdto1=new CustomerDTO();
customerDTO.setContactNo(9865413l);
System.out.println(customerDTO.getContactNo());

customerDTO.setCustomerId(2345);
System.out.println(customerDTO.getCustomerId());

customerDTO.setEmailId("something.xworkz@GMAIL.COM");
System.out.println(customerDTO.getEmailId());

customerDTO.setName("sourabh");
System.out.println(customerDTO.getName());


	}

}	

