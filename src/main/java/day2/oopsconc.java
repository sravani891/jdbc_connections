package day2;

class dog {
	String Colour;
	String Breed;
	int age;
	int height;
	boolean gender;

	void eating() {
		System.out.println("dog is eating");
	}

	void walking() {
		System.out.println("dog is walking");
	}
	void playing() {
		System.out.println("dog is playing");
	}
	void barking() {
		System.out.println("dog is barking");
	}
	void sleeping() {
		System.out.println("dog is sleeping");
	}
}
public class oopsconc {
	public static void main(String[] args) {
dog d=new dog();
d.Colour="blue";
d.age=4;
d.Breed="shitzu";
d.gender=true;
d.height=40;
System.out.println(d.Colour);
System.out.println(d.age);
System.out.println(d.Breed);
System.out.println(d.gender);
System.out.println(d.height);
d.eating();
d.walking();
d.barking();
d.playing();
d.sleeping();
	}
}
