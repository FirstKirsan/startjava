public class Guess {
	public static void main(String[] args) {
		int compNumber = 100;
		int myNumber = 63;
		int max = 101;
		int min = 0;

		while (compNumber != myNumber) {
			if (compNumber > myNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				min = myNumber;
				myNumber += (max - myNumber)/2;
				System.out.println(myNumber);
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				max = myNumber;
				myNumber = min + (myNumber - min)/2;
				System.out.println(myNumber);
			}

		}
		System.out.println("Вы угадали!");
	}
	
}