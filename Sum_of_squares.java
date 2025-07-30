
import java.util.Scanner;
public class Sum_of_squares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum += i*i;
			System.out.println("Sum of squares: " +sum);
		}
	}

}
