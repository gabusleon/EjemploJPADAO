package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {
    // Sería mejor por inyección de objetos
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getFactory() {
	return factory;
    }

    public abstract UserDAO getUserDAO();

    public abstract UserDetailDAO getUserDetailDAO();

    public abstract CategoryDAO getCategoryDAO();

    public abstract ShoppingBasketDAO getShoppingBasketDAO();

    public abstract ProductDAO getProductDAO();

    public abstract SocioDAO getSocioDAO();

    public abstract AsociacionDAO getAsociacionDAO();

}
