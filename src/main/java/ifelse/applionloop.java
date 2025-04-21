package ifelse;


import java.util.Scanner;

public class applionloop {
public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	int ch;
	do {
		DisplayMenu();
		ch=Integer.parseInt(src.next());
		switch (ch) {
		case 1: 
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("invalid");
			break;
		
		
		}	
		
	}while (ch>0);
}
		
	
private static void addition() {
	// TODO Auto-generated method stub
	
}


private static void subtraction() {
	// TODO Auto-generated method stub
	
}


private static void DisplayMenu() {
	System.out.println("enter choice");
	System.out.println("\t1.addition");
	System.out.println("\t2.subtraction");
	
}
}	



