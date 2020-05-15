package ec.edu.ups.dao;

import ec.edu.ups.entidad.UserDetail;

public interface UserDetailDAO extends GenericDAO<UserDetail, Integer> {
	public UserDetail findByUserId(int userId);
}
