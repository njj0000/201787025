import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			double area, radius;
			
			System.out.println("���� �������� �Է��Ͻÿ�");
			radius = scn.nextDouble();
			area = Math.PI*radius*radius;
			System.out.println(area);
		
	}

}
