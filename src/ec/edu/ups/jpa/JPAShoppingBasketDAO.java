package ec.edu.ups.jpa;

import ec.edu.ups.dao.ShoppingBasketDAO;
import ec.edu.ups.entidad.ShoppingBasket;

public class JPAShoppingBasketDAO extends JPAGenericDAO<ShoppingBasket, Integer> implements ShoppingBasketDAO {
    
    public JPAShoppingBasketDAO() {
	super(ShoppingBasket.class);
    }

}
