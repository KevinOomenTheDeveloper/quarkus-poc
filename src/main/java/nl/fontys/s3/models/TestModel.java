//package nl.fontys.s3.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class TestModel extends PanacheEntityBase {

	@Id
	public Long id;

	public String name;
	public String description;

    public TestModel()
    {
        
    }

	public TestModel(String name, String description) {
        this.name = name;
		this.description = description;
	}

	public TestModel(TestModel model) {
        this.name = model.name;
		this.description = model.description;
	}
	
}