package ec.edu.ups.test;

import java.util.List;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UserDAO;
import ec.edu.ups.entidad.User;

public class TestLevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDAO ud = DAOFactory.getFactory().getUserDAO();
		List<User> lista = ud.getByLevel(2);
		System.out.println(lista);
	}

}
