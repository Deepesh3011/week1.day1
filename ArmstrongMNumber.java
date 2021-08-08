package week1.day1;

public class ArmstrongMNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 153;
		int calculated = 0, remainder, newnum;
		newnum = number;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			calculated = calculated + (remainder * remainder * remainder);
		}
		if (calculated == newnum) {
			System.out.println(newnum + " is Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}

}
