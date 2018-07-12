public class JeagerTest {
	public static void main(String[] args) {
		Jeager jeagerOne = new Jeager("Имя", "Марка", "USA", 70.7f, 2.1f, 3, 8, 9);
		Jeager jeagerTwo = new Jeager("ВторойРобот", "БумБокс", "РФ", 170.7f, 12.1f, 1, 5, 19);

		System.out.println(jeagerOne);
		System.out.println(jeagerTwo);
	}
	
}