package ec.edu.ups.jpa;

import ec.edu.ups.dao.UserDetailDAO;
import ec.edu.ups.entidad.UserDetail;

public class JPAUserDetailDAO extends JPAGenericDAO<UserDetail, Integer> implements UserDetailDAO {

    public JPAUserDetailDAO() {
	super(UserDetail.class);
    }

    @Override
    public UserDetail findByUserId(int userId) {
	// TODO Auto-generated method stub
	return null;
    }
}
