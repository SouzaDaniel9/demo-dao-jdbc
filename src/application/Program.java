package application;

import java.util.List;

import entities.model.Department;
import entities.model.Seller;
import model.Dao.DaoFactory;
import model.Dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

//		System.out.println("***** TESTE 01: Procurar o id de um vendedor *****");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);

		System.out.println("\n***** TESTE 02: Exibir os vendedores de um departamento *****");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller sel : list) {
			System.out.println(sel);
		}

		System.out.println("\n***** TESTE 03: Exibir todos vendedores *****");
		list = sellerDao.findAll();
		for (Seller sel : list) {
			System.out.println(sel);
		}

//		System.out.println("\n***** TESTE 04: Inserir Vendedor *****");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());

//		System.out.println("\n***** TESTE 05: Alterar dados de um vendedor *****");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Waine");
//		sellerDao.update(seller);
//		System.out.println("Update Completed");
	}

}
