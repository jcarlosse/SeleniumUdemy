package day3;

public class JumpingStatements {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);// 1

			if (i == 5) {
				break;
			}
		}
		
		for (int i = 1; i <= 10; i++) {

			

			if (i == 3 || i == 5 || i == 7) {
				continue; //it will jump to the next number
			}
			
			System.out.println(i);// 1
		}

	}

}
