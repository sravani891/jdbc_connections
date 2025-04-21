package day2;

class student {
	private String Rollno;
	private String stdname;
	private String stdemaill;
	private String stdpawrd;
	public void setRollnumbers(String rollnum) 
		this.Rollno= rollnum;
	

	public String getRollno() {
		return Rollno;
	}

	public void setRollno(String rollno) {
		Rollno = rollno;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdemaill() {
		return stdemaill;
	}

	public void setStdemaill(String stdemaill) {
		this.stdemaill = stdemaill;
	}

	public String getStdpawrd() {
		return stdpawrd;
	}

	public void setStdpawrd(String stdpawrd) {
		this.stdpawrd = stdpawrd;

	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public student(String rollno, String stdname, String stdemaill, String stdpawrd) {
		super();
		Rollno = rollno;
		this.stdname = stdname;
		this.stdemaill = stdemaill;
		this.stdpawrd = stdpawrd;
	}

}

public class encap {
	public static void main(String[] args) {
student s=new student();
s.setRollno("5");
System.out.println(s.getRollno());
s.setStdname("srav");
System.out.println(s.getStdname());
s.setStdemaill("srav@12");
System.out.println(s.getStdemaill());
s.setStdpawrd("sravani");
System.out.println(s.getStdpawrd());

}
	}

}
