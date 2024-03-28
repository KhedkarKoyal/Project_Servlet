package org.techhubModel;

public class AddHotelDetailsModel extends AddHotelModel {
@Override
	public String toString() {
		return "AddHotelDetailsModel [did=" + did + ", Address=" + Address + ", Email=" + Email + ", Contact=" + Contact
				+ ", Hotel=" + Hotel + ", City=" + City + "]";
	}
private int did;
private String Address;
private String Email;
private String Contact;
private String Hotel;
private String City;
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getContact() {
	return Contact;
}
public void setContact(String contact) {
	Contact = contact;
}
public String getHotel() {
	return Hotel;
}
public void setHotel(String hotel) {
	Hotel = hotel;
}
}
