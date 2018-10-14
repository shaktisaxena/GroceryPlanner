package com.de.groceryplanner.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class ProductDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long productId;

	private String name;

	private String barCode;

	private int numberOfItems;

	private StoreDto storeName;

	private CategoryDto productCategory;
	
	public ProductDto() {
		
	}
	

	/**
	 * @param name
	 * @param barCode
	 * @param numberOfItems
	 * @param storeName
	 * @param productCategory
	 */
	public ProductDto(String name, String barCode, int numberOfItems, StoreDto storeName, CategoryDto productCategory) {
		this.name = name;
		this.barCode = barCode;
		this.numberOfItems = numberOfItems;
		this.storeName = storeName;
		this.productCategory = productCategory;
	}

	/**
	 * @return the name
	 */
	@Column(name="PRODUC_TNAME")
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
	 * @return the barCode
	 */
	@Column(name="PRODUCT_BARCODE", nullable=false)
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the numberOfItems
	 */
	@Column(name="PRODUCT_QUANTITY")
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * @param numberOfItems the numberOfItems to set
	 */
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	/**
	 * @return the storeName
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	public StoreDto getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(StoreDto storeName) {
		this.storeName = storeName;
	}

	/**
	 * @return the productCategory
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	public CategoryDto getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(CategoryDto productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the productId
	 */
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		
		return String.format("Product id is %s, Product Name is %s", this.getProductId(),this.getName());
	}
	

}
