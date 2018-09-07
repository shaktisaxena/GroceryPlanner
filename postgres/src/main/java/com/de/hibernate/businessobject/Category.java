package com.de.hibernate.businessobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	
	private String name;
	
	@Id
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	private Long id;
	

	/**
	 * @param name
	 */
	public Category(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	@Column(name="CATEGORY_NAME",nullable=false)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
