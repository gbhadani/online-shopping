package net.gbh.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.gbh.shoppingbackend.dao.CategoryDAO;
import net.gbh.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();
		
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Shirts");
		category.setDescription("This is a shirt");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		//adding first category
		category.setId(2);
		category.setName("Trouser");
		category.setDescription("This is a trouser");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		category = new Category();
		//adding first category
		category.setId(3);
		category.setName("Inners");
		category.setDescription("This is a inner");
		category.setImageURL("CAT_3.png");
				
		categories.add(category);
		
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category: categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
