
import java.util.Scanner;

public class calculator{

	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int fnum, snum, answer;
	System.out.println("enter First Number");
	fnum=in.nextInt();
	System.out.println("enter Second Number");
	snum=in.nextInt();
	
	int choice;
	System.out.println("what do you want to do?\n 1.Add \n 2.Division \n 3.Multiply \n 4.Modulus");
	choice = in.nextInt();
	switch(choice)
	{
	case 1:
		answer = fnum+snum;
		System.out.println(answer);
		break;
	case 2:
		answer = fnum/snum;
		System.out.println(answer);
		break;
	case 3:
		answer = fnum*snum;
		System.out.println(answer);
		break;
	case 4:
		answer = fnum % snum;
		System.out.println(answer);
		break;
		default:
			System.out.println("Wrong Choice");
			break;
			
	
	  }
	}
}