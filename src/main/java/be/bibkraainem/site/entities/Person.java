package be.bibkraainem.site.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}
	
}
