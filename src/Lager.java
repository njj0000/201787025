import java.util.Scanner;
public class Lager {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x,y,m;
		System.out.println("ù��° ����");
		x=scn.nextInt();
		System.out.println("�ι�° ����");
		y=scn.nextInt();
		
//		if(x>y) {
//			m=x;
//		}
//		else {
//			m=y;
	//}
		m=(x>y)?x:y;
		System.out.println("ū���� "+m);
	}

}
