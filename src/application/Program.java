package application;

import java.util.Date;

import entities.model.Department;
import entities.model.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println(new Department(1, "Books"));
		System.out.println();
		System.out.println(
				new Seller(12, "Daniel Souza", "Daniel@gmail.com", new Date(), 2500.00, new Department(1, "Books")));
	}

}
