import java.util.Scanner;

public class TASK_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("enter "+i+" subject marks : ");
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int ele:arr) {
			sum=sum+ele;
		}
		
		System.out.println("Total of marks :"+sum);
		
		int avg=sum/5;
		System.out.println("Avrage of marks :"+avg);
		
		float per=(sum*100f)/500;
		System.out.println("Percentage :"+per+"%");
		
		if(per>90) {
			System.out.println("you achieve grade A");
		}
		else if(per>80 && per<=90) {
			System.out.println("you achieve grade B");
		}
		else if(per>70 && per<=80) {
			System.out.println("you achieve grade C");
		}
		else if(per>60 && per<=70) {
			System.out.println("you achieve grade D");
		}
		else if(per>50 && per<=60) {
			System.out.println("you achieve grade E");
		}
		else if(per>40 && per<=50) {
			System.out.println("you achieve grade F");
		}
		else {
			System.out.println("you are fail,Better luck next time!!");
		}
	}

}
