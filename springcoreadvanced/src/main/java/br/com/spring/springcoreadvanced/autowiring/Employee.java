package br.com.spring.springcoreadvanced.autowiring;

public class Employee {

	private Address address;
	
	public Employee(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getaddress() {
		return address;
	}

	public void setaddress(Address address) {
		this.address = address;
	}

}
