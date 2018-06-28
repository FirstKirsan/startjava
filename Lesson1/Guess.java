public class Guess {
	public static void main(String[] args) {
		int compNumber = 64;
		int myNumber = 14;

		while (compNumber != myNumber) {
			if (compNumber > myNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");

			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				myNumber /= 2;
			}

		}
		System.out.println("Вы угадали!");
	}
	
}