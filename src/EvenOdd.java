import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int number;
		
		System.out.println("������ �Է�");
		number=scn.nextInt();
		
		if(number %2==0) {
			System.out.println(number +"�� ¦���Դϴ�");	
		}
		else
			System.out.println("Ȧ���Դϴ�");
	}

}
