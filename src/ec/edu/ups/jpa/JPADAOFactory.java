package ec.edu.ups.jpa;

import ec.edu.ups.dao.AsociacionDAO;
import ec.edu.ups.dao.CategoryDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.ProductDAO;
import ec.edu.ups.dao.ShoppingBasketDAO;
import ec.edu.ups.dao.SocioDAO;
import ec.edu.ups.dao.UserDAO;
import ec.edu.ups.dao.UserDetailDAO;

public class JPADAOFactory extends DAOFactory {

    @Override
    public CategoryDAO getCategoryDAO() {
	return new JPACategoryDAO();
    }

    @Override
    public UserDAO getUserDAO() {
	return new JPAUserDAO();
    }

    @Override
    public UserDetailDAO getUserDetailDAO() {
	return new JPAUserDetailDAO();
    }

    @Override
    public ShoppingBasketDAO getShoppingBasketDAO() {
	return new JPAShoppingBasketDAO();
    }

    @Override
    public ProductDAO getProductDAO() {
	return new JPAProductDAO();
    }

    @Override
    public SocioDAO getSocioDAO() {
	return new JPASocioDAO();
    }

    @Override
    public AsociacionDAO getAsociacionDAO() {
	return new JPAAsociacionDAO();
    }

}
