import java.util.Scanner;
public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int m,d,y;
		
		System.out.println("�⵵ �Է��ϼ���");
		y=scn.nextInt();
		System.out.println("�� �Է�");
		m=scn.nextInt();
		
		switch(m) {
		case 4:
		case 6:
		case 9:
		case 11:
			d=30; break;
			case 2: 
				if(y%4==0 && y%100!=0 || y%400==0) {
					d=29;
				}else {
					d=28;
				}
				break;
				default:
					d=31;break;
		}
		System.out.println(y+"��"+m+"����"+d+"���Դϴ�");
	}
}
