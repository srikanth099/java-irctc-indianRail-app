package org.ecom.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ecom_product_info")
public class Product implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name ="discription")
	private String Discription;
	
	

	public Product(long altKey, String name, double price, int quantity, String discription) {
		super();
		this.altKey = altKey;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		Discription = discription;
	}

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDiscription() {
		return Discription;
	}

	public void setDiscription(String discription) {
		Discription = discription;
	}

	@Override
	public String toString() {
		return "Product [altKey=" + altKey + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", Discription=" + Discription + "]";
	}
	
	
	

}
