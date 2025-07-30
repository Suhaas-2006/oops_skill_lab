
import java.util.Scanner;
public class GCD_2numbers {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(b!=0) {
			int temp = b;
			b = a % b;
			a=temp;
		}
		System.out.println("GCD is:" +a);
	}

}
