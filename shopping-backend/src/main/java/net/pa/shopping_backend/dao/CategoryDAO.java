package net.pa.shopping_backend.dao;

import java.util.List;

import net.pa.shopping_backend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
}
