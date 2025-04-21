package day2;

class phones {
	String colour;
	String model;
	int size;
	int ram;

	void calander() {
		System.out.println("calander is available");
	}

	void playstore() {
		System.out.println("install games");
	}

	void notes() {
		System.out.println("u can write notes here");

	}
}

class samsung extends phones {
	String version;
	void pen() {
	    System.out.println("use for scroll");	
	}
	
}

public class inherit {
	public static void main(String[] args) {

	}

Samsung s=new samsung() {
s.colour="blue";

}
