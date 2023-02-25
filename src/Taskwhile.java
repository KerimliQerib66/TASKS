
public class Taskwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean programrun=true;
        while(programrun) {
        	System.out.println("1");
        	
        	for(int i=1;i<5;i++) {
        		if(i==3) {
        			programrun=false;
        			break;
        		}
        		System.out.println(i);
        	}
//        	if(programrun==false) {
//        		break;
//        	}
        	System.out.println("2");
        }
        	
	}

}
