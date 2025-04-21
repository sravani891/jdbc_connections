package ifelse;


import java.util.Scanner;

public class bank {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	System.out.println("welcome to banking system");
	System.out.println("\t1.deposit"+"\n"+"\t2.withdraw"+"\n"+"\t3.checkbalance");
	System.out.println("amount");
	int amount=30;
	int opt=src.nextInt();
	case 1:
	    System.out.println("enter deposite amount:");
		double depositeamount =src.nextDouble();
		amount += depositeamount;
		System.out.println("new amount:"+amount);
	    break;
	case 2:
		System.out.println("enter withdraw amount:");
		double withdrawamount =src.nextDouble();
		if(withdrawamount <= amount) {
			amount -=withdrawamount;
			System.out.println("new amount:"+amount);
		}else {
			System.out.println("insufficient amount");
		}
		break;
	case 3:
		System.out.println("balance amount is:"+amount);
		break;
	default:
		System.out.println("error");
		break;
    }
    src.close();
}
		
		
		
	
	
	
}

}
