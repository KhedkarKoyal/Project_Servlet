package org.techhubModel;

public class DetailsViewModel extends ViewHotelModel {

public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getContact() {
	return Contact;
}
public void setContact(String contact) {
	Contact = contact;
}
public String getEmail() {
	return Email;
}

@Override
public String toString() {
	return "DetailsViewModel [Address=" + Address + ", City=" + City + ", Contact=" + Contact + ", Email=" + Email
			+ ", did=" + did + "]";
}	
public void setEmail(String email) {
	Email = email;
}
private String Address;
private String City;
private String Contact;
private String Email;

private int did;

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}



}
