package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidad.User;

public interface UserDAO extends GenericDAO<User, Integer> {
	public List<User> getByLevel(int level);
}
