package ec.edu.ups.entidad;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;
    private String description;

    public Category() {
    }

    public Category(int id, String name, String description) {
	this.setId(id);
	this.setName(name);
	this.setDescription(description);
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return this.description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

}
