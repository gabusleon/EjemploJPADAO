package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.SocioDAO;
import ec.edu.ups.entidad.Asociacion;
import ec.edu.ups.entidad.Socio;


public class TestManyToMany {
    public static void main(String[] args) {
	SocioDAO sd = DAOFactory.getFactory().getSocioDAO();
	
	Socio s1 = new Socio(1, "pepito");
	Socio s2 = new Socio(2, "juanito");
	
	Asociacion a1 = new Asociacion(1, "IEEE");
	a1.addSocio(s1);	
	a1.addSocio(s2);	
	Asociacion a2 = new Asociacion(2, "ADETUPS");
	a2.addSocio(s1);
	a2.addSocio(s2);
	Asociacion a3 = new Asociacion(3, "ABREC");
	a3.addSocio(s1);
	a3.addSocio(s2);		
	
	s1.addAsociacion(a1);
	s1.addAsociacion(a2);
	s1.addAsociacion(a3);
	
	s2.addAsociacion(a1);
	s2.addAsociacion(a2);
	s2.addAsociacion(a3);	
	
	//crea los socios y asociaciones
	sd.create(s1);
	sd.create(s2);

	// Error: Se debe elimiar el producto de la entidad
	//a1.removeSocio(s1);
	s1.removeAsociacion(a1);
	sd.update(s1);

	// Se debe eliminar manualmente
	DAOFactory.getFactory().getAsociacionDAO().deleteByID(2);
    }
}


