package practice;

import java.util.List;

public class Person {
	
	private int id;
	private String Name;
	private List<Address> address;
	private List<String> phone;
	public static class Address{
		private String dono;
		private String street;
		public String getDono() {
			return dono;
		}
		public void setDono(String dono) {
			this.dono = dono;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public List<String> getPhone() {
		return phone;
	}
	
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	
	
	

}
