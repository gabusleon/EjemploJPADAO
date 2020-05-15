package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asociacion
 *
 */

@Entity
public class Asociacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nombre;
    @ManyToMany(mappedBy = "asociaciones")
    @JoinColumn
    private Collection<Socio> socios;

    public Asociacion() {
	socios = new HashSet<Socio>();
    }

    public Asociacion(int id, String nombre) {
	this.id = id;
	this.nombre = nombre;
	socios = new HashSet<Socio>();
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void addSocio(Socio socio) {
	this.socios.add(socio);
    }

    public void removeSocio(Socio socio) {
	this.socios.remove(socio);
    }

    @Override
    public String toString() {
	return "Asociacion [id=" + id + ", nombre=" + nombre + "]";
    }

}
