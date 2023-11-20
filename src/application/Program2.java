package application;

import java.util.List;

import entities.model.Department;
import model.Dao.DaoFactory;
import model.Dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao dd = DaoFactory.createDepartmentDao();

		// Insere um novo departamento
//		dd.insert(new Department(null, "Music");
//		System.out.println("Criado com sucesso o id: " + dep.getId());

		// Modifica o nome de um departamento utilizando o id
//		dd.update(new Department(05, "Movie"));

		// Deletar um departamento utilizando o id
//		dd.deleteById(05);
//		System.out.println("Deletado com sucesso");

		// Consultando um departamento utilizando o id
//		System.out.println(dd.findById(04));

		// Consulta a lista de departamento
		List<Department> list = dd.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
	}

}
