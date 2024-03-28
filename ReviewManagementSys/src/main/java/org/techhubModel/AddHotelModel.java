package org.techhubModel;

public class AddHotelModel {
@Override
	public String toString() {
		return "AddHotelModel [id=" + id + ", AddHotel=" + AddHotel + "]";
	}
private int id;
public String AddHotel;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddHotel() {
	return AddHotel;
}
public void setAddHotel(String addHotel) {
	AddHotel = addHotel;
}
}
