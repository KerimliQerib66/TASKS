
public class Task20 {

	public static void main(String[] args) {
		
print("hello world",3,7);
	}
public static void print(String a,int begin ,int end)
{
	char [] arr=a.toCharArray();
	for(int i=begin;i<end;i++)
	{
		System.out.println(arr[i]);
	}
}
}
