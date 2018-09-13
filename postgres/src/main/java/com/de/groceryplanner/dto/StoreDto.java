package com.de.groceryplanner.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STORE")
public class StoreDto {

	private String name;

	private StoreType storetype;

	private String storeLink;

	private int storeId;

	/**
	 * @param name
	 * @param storetype
	 * @param storeLink
	 * @param id
	 */
	public StoreDto(String name, StoreType storetype, String storeLink) {
		this.name = name;
		this.storetype = storetype;
		this.storeLink = storeLink;

	}

	/**
	 * @return the name
	 */
	@Column(name = "STORE_NAME", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the storetype
	 */
	@Enumerated(EnumType.STRING)
	public StoreType getStoretype() {
		return storetype;
	}

	/**
	 * @param storetype the storetype to set
	 */
	public void setStoretype(StoreType storetype) {
		this.storetype = storetype;
	}

	/**
	 * @return the storeLink
	 */
	@Column(name = "STORE_WEBLINK")
	public String getStoreLink() {
		return storeLink;
	}

	/**
	 * @param storeLink the storeLink to set
	 */
	public void setStoreLink(String storeLink) {
		this.storeLink = storeLink;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(name = "STORE_ID")
	public int getId() {
		return storeId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.storeId = id;
	}

}
