package model.Dao;

import java.util.List;

import entities.model.Seller;

public interface SellerDao {

	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Integer id);

	// Procuta o id na lista
	Seller findById(Integer id);

	// Mostra toda a lista
	List<Seller> findAll();

}
