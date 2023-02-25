package Example;

public class fh {
public static void myrec(int a) {
	if(a<5) {
		System.out.print(a);
		myrec(a+1);
		System.out.print(a);
	}
}
	public static void main(String[] args) {
myrec(2);
	}

}

