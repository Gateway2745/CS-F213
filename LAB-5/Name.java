package lab5;

import java.util.StringTokenizer;

public class Name {

	private String fname;
	private String mname;
	private String lname;

	public Name(String name) {

		if (name.indexOf(',') > 0) {
			StringTokenizer st = new StringTokenizer(name, ",");
			fname = st.nextToken();
			mname = st.nextToken();
			lname = st.nextToken();
		} else {
			StringTokenizer st = new StringTokenizer(name, ";");
			lname = st.nextToken();
			mname = st.nextToken();
			fname = st.nextToken();
		}
	}

	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}


	public static void main(String[] args) {
		Name n = new Name("Max,Eddy,Me");

	}

}
