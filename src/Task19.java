
public class Task19 {

	public static void main(String[] args) {
   System.out.print(contain("salam","baxam","am"));
	}
public static boolean contain(String a,String b,String c)
{
	if(a.contains(c)&&b.contains(c)) {
		return true;
	}
	else {
		return false;
	}
}
}
