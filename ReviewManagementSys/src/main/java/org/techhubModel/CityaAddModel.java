package org.techhubModel;

public class CityaAddModel {
    private int Cid;
    private String cname;

   
    public int getCid() {
		return Cid;
	}


	public void setCid(int cid) {
		Cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
    public String toString() {
        return "CityaAddModel [Cid=" + Cid + ", cname=" + cname + "]";
    }
}
