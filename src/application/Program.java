package application;

import java.util.List;

import entities.model.Department;
import entities.model.Seller;
import model.Dao.DaoFactory;
import model.Dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("***** TESTE 01: Procurar o id de um vendedor *****");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n***** TESTE 02: Exibir os vendedores de um departamento *****");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller sel : list) {
			System.out.println(sel);
		}

	}

}
