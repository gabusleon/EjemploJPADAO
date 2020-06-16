package ec.edu.ups.test;

import java.util.List;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UserDAO;
import ec.edu.ups.entidad.User;

public class TestCriteria {
    public static void main(String[] args) {
	UserDAO ud = DAOFactory.getFactory().getUserDAO();
	String[] atributos = {"name", "password"};
	String[] valores = {"Uno", "1"};
	List<User> lista = ud.find(atributos, valores, null, 0, 0);
	System.out.println(lista);
    }
}
