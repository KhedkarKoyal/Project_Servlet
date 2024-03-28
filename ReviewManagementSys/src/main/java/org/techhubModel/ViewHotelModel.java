package org.techhubModel;

public class ViewHotelModel {
	public String AddHotel;
	
	private int hid;
	public int getId() {
		return hid;
	}
	@Override
	public String toString() {
		return "ViewHotelModel [AddHotel=" + AddHotel + ", hid=" + hid + "]";
	}
	public void setId(int id) {
		this.hid = id;
	}
	public String getAddHotel() {
		return AddHotel;
	}
	public void setAddHotel(String addHotel) {
		AddHotel = addHotel;
	}
	
}
