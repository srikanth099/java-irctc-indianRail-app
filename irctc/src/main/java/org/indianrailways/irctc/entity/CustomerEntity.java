package org.indianrailways.irctc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="irctc_customer_info")
public class CustomerEntity implements Serializable {
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="att_key")
	private long altKey;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="irctc_id")
	private String irctcId;

	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;

	@Column(name="phone")
	private String phone;

	@Column(name="from_station")
	private String fromStation;

	@Column(name="to_station")
	private String toStation;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIrctcId() {
		return irctcId;
	}

	public void setIrctcId(String irctcId) {
		this.irctcId = irctcId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	@Override
	public String toString() {
		return "CustomerEntity [altKey=" + altKey + ", customerName=" + customerName + ", irctcId=" + irctcId
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + ", fromStation=" + fromStation
				+ ", toStation=" + toStation + "]";
	}
	
	

}
