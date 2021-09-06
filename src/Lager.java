import java.util.Scanner;
public class Lager {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x,y,m;
		System.out.println("첫번째 정수");
		x=scn.nextInt();
		System.out.println("두번째 정수");
		y=scn.nextInt();
		
//		if(x>y) {
//			m=x;
//		}
//		else {
//			m=y;
	//}
		m=(x>y)?x:y;
		System.out.println("큰수는 "+m);
	}

}
