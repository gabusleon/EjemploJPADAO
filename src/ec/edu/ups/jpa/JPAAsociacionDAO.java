package ec.edu.ups.jpa;

import ec.edu.ups.dao.AsociacionDAO;
import ec.edu.ups.entidad.Asociacion;

public class JPAAsociacionDAO extends JPAGenericDAO<Asociacion, Integer> 
	implements AsociacionDAO {

    public JPAAsociacionDAO() {
	super(Asociacion.class);
    }

}

