package org.indianrailways.irctc.dto;

public class CustomerDto {
	
	private String customerName;
	
	private String irctcId;
	
	private String password;
	
	private String email;
	
	private String phone;
	
	private String fromStation;
	
	private String toStation;

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
		return "CustomerDto [customerName=" + customerName + ", irctcId=" + irctcId + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", fromStation=" + fromStation + ", toStation=" + toStation
				+ "]";
	}

	
	
	
	
}
