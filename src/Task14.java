
public class Task14 {

	public static void main(String[] args) {
		System.out.print(foo(1,2,3,1));

	}
	public static boolean foo(int a,int b,int c,int d)
	{
		if(a==b || a==c ||a==d || b==c ||b==d || c==d)
		{
			return true;
		}
		else {
		   return false;
		}
	}

}
