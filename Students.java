package Demo.Hiber;

import jakarta.persistence.*;
@Table (name = "students")

public class Students {
	@Id @GeneratedValue	@Column(name ="stud_id")
	private int id;
	@Column(name ="stud_name")
	private String name;
	@Column(name ="stud_Address")
	private String  Address;
	@Column(name ="stud_DOB")
	private int DOB;
	@Column(name ="stud_Div")
	private String  Div;
	 
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, String address, int dOB, String div) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		DOB = dOB;
		Div = div;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public String getDiv() {
		return Div;
	}
	public void setDiv(String div) {
		Div = div;
	}
	

}
