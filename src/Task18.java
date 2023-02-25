
public class Task18 {

	public static void main(String[] args) {
       System.out.print(foo("soz",'c',5));
	}
public static String foo(String s,char c,int count)
{
	for(int i=0;i<count;i++)
	{
		s+=c;
	}
	return s;
}
}
