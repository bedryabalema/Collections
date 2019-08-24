import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		System.out.print("Please enter your age: \t");
		Scanner sc = new Scanner(System.in);

	try{
		int age = sc.nextInt();
		if(age < 21) {
			throw new InvalidAgeException("Your age should be >= 21");
		}else {
			System.out.println("Voting Done ....");
		}
	}catch(InvalidAgeException e) {
		System.out.println("Error: "+e.getMessage());
		System.out.println(e.toString());
	}
	System.out.println("Next Voter!");

	
}

	
}
