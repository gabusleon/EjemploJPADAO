package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.Query;

import ec.edu.ups.dao.UserDAO;
import ec.edu.ups.entidad.User;

public class JPAUserDAO extends JPAGenericDAO<User, Integer> implements UserDAO {

    public JPAUserDAO() {
	super(User.class);
    }

    @Override
    public List<User> getByLevel(int level) {
	Query query = em.createNamedQuery("getByLevel");
	query.setParameter("level", level);
	@SuppressWarnings("unchecked")
	List<User> res3 = query.getResultList();

	return res3;
    }
    
}

