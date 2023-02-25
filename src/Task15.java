
public class Task15 {

	public static void main(String[] args) {
	 System.out.print(increase(1,2,3,4));
	}
	public static boolean increase(int a,int b,int c,int d)
	{
		if(d>c && c>b && b>a)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
