import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class SortExample {
public static void main(String[] args) {
	final int SIZE=10;
	int[] numbers =new int[SIZE];
	
for(int i=0; i<numbers.length;i++) {
	int r =(int) (Math.random()*100);
	numbers[i]= r;
	}
System.out.println("���� �迭");
for (int i : numbers) {
	System.out.println(i+"");
}
System.out.println();
Arrays.sort(numbers);

System.out.println("������ �迭");
for (int i : numbers) {
	System.out.println(i+"");
}
}
}
