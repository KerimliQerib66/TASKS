
public class Task21 {

	public static void main(String[] args) {
		
System.out.print(foo("salam","salam1"));
	}
public static String foo(String a,String b)
{
	char [] arr1=a.toCharArray();
	char [] arr2=b.toCharArray();
	int a1=arr1.length;
	int b2=arr2.length;
	if(a1>b2)
	{
		return a;
	}
	else {
		return b;
	}
}
}
