public class Calc {
	public static void main (String[] args) {
		int num1=3;
		int num2=5;
		char oper='-';

		if (oper=='*') {
			System.out.println(num1*num2);
		} else if (oper=='/') {
			System.out.println(num1/num2);
		} else if (oper=='+') {
			System.out.println(num1+num2);
		} else if (oper=='-') {
			System.out.println(num1-num2);
		} else if (oper=='%') {
			System.out.println(num1%num2);
		} else if (oper=='^') {
			int result=1;
			for (int i=0;i<num2 ;i++ ) {
				result*=num1;
			}
			System.out.println(result);
		} else System.out.println("Unknown operation");

	}
}