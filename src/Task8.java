import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int i=1;
		int faktorial=1;
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
        while( i<=a)
        {
        	faktorial*=i;
        	i++;
        }
        System.out.print(faktorial);
	}

}
