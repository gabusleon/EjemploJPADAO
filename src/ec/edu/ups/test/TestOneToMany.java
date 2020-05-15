package ec.edu.ups.test;

import java.util.GregorianCalendar;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.ShoppingBasketDAO;
import ec.edu.ups.entidad.Product;
import ec.edu.ups.entidad.ShoppingBasket;

public class TestOneToMany {

    public static void main(String[] args) {
	ShoppingBasketDAO sbd = DAOFactory.getFactory().getShoppingBasketDAO();

	ShoppingBasket sb = new ShoppingBasket(3, new GregorianCalendar());
	Product p1 = new Product(10, 3, "producto 1", sb);

	sb.addProducts(p1);
	sb.addProducts(new Product(11, 4, "producto 2", sb));
	sb.addProducts(new Product(12, 1, "producto 3", sb));
	sbd.create(sb);

	// Error: Se debe elimiar el producto de la entidad
	sb.removeProduct(p1);
	sbd.update(sb);

	// Se debe eliminar manualmente
	DAOFactory.getFactory().getProductDAO().deleteByID(1);
    }
}

