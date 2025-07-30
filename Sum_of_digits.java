
import java.util.Scanner;
public class Sum_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		while(num>9) {
			int sum=0;
			while(num!=0) {
				sum += num % 10;
				num /= 10;
			}
			num=sum;
		}
		System.out.println("Single digit sum:" +num);
	}

}
