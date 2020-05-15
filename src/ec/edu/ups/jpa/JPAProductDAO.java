package ec.edu.ups.jpa;

import ec.edu.ups.dao.ProductDAO;
import ec.edu.ups.entidad.Product;

public class JPAProductDAO extends JPAGenericDAO<Product, Integer> implements ProductDAO {

    public JPAProductDAO() {
	super(Product.class);
    }

}
