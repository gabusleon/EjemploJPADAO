package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Socio
 *
 */

@Entity
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nombre;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Collection<Asociacion> asociaciones;

    public Socio() {
	asociaciones = new HashSet<Asociacion>();
    }

    public Socio(int id, String nombre) {
	this.id = id;
	this.nombre = nombre;
	asociaciones = new HashSet<Asociacion>();
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

    public void addAsociacion(Asociacion asociacion) {
	this.asociaciones.add(asociacion);
    }

    public void removeAsociacion(Asociacion asociacion) {
	this.asociaciones.remove(asociacion);
    }

    @Override
    public String toString() {
	return "Socio [id=" + id + ", nombre=" + nombre + "]";
    }

}
