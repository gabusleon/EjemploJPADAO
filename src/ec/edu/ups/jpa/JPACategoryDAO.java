package ec.edu.ups.jpa;

import ec.edu.ups.dao.CategoryDAO;
import ec.edu.ups.entidad.Category;

public class JPACategoryDAO extends JPAGenericDAO<Category, Integer> implements CategoryDAO {
    
    public JPACategoryDAO() {
	super(Category.class);
    }
    
}

