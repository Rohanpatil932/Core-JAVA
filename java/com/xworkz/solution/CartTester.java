package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solution.dto.ShoppingCartDTO;

public class CartTester {

	public static void main(String[] args) {

		ShoppingCartDTO dto1 = new ShoppingCartDTO("Jeans", 2, 2000);

		ShoppingCartDTO dto2 = new ShoppingCartDTO("Shirt", 1, 1000);

		Collection<ShoppingCartDTO> cartDTOs = new ArrayList<ShoppingCartDTO>();
		cartDTOs.add(dto1);
		cartDTOs.add(dto2);

		ShoppingCartDTO dto3 = new ShoppingCartDTO("sneakers", 1, 3000);

		boolean cont = cartDTOs.contains(dto3);
		System.out.println(cont);

		for (ShoppingCartDTO shoppingCartDTO : cartDTOs) {
			if (shoppingCartDTO.getItemName().equals("sneakers")) {
				System.out.println("Sneaker is in the cart");
			} else {
				System.out.println("Sneaker is  not in the cart");
			}
		}
		if (cont) {
			System.out.println("Sneaker is in the cart");
		} else {
			System.out.println("adding sneakers");
			cartDTOs.add(dto3);
		}
		System.out.println("After adding sneakers" + cartDTOs.size());
	}

}
