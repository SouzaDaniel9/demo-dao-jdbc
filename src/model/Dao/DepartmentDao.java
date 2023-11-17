package model.Dao;

import java.util.List;

import entities.model.Department;

public interface DepartmentDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Integer id);

	// Procuta o id na lista
	Department findById(Integer id);

	// Mostra toda a lista
	List<Department> findAll();

}
