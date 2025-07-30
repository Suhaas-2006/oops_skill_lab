
import java.util.Scanner;
public class Palindrome_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int original = num, rev=0;
		while(num!=0) {
			rev = rev*10+num%10;
			num/=10;
		}
		if(rev==original) {
			System.out.println("Palindrone number");
		}else {
			System.out.println("Not a Palindrome number");
		}
		
	}

}
