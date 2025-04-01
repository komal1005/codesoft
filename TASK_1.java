import java.util.Random;
import java.util.*;
public class TASK_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int com_no=r.nextInt(100);
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the guess :");
			int user_guess=sc.nextInt();
			if(user_guess==com_no) {
				System.out.println("your guess is correct");
				//System.out.println("would you like to play again y/n");
				break;
			}
			else if(user_guess<com_no) {
				System.out.println("your no is less than computer value.");
			}
			else {
				System.out.println("your no is greater than computer value.");
			}
		}
		while(true) {
			System.out.println("would you like to play again y/n");
			String c=sc.next();
			if(c.equalsIgnoreCase("y")) {
				for(int i=1;i<=5;i++) {
					System.out.println("Enter the guess :");
					int user_guess=sc.nextInt();
					if(user_guess==com_no) {
						System.out.println("your guess is correct");
						break;
					}
					else if(user_guess<com_no) {
						System.out.println("your no is less than computer value.");
					}
					else {
						System.out.println("your no is greater than computer value.");
					}
				}
			}
			else {
				System.out.println("Thank for playing");
			}
		}
		}
}
