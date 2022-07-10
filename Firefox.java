package week1.day2;

public class Firefox {
	String name="Firefox";
	int year=1998 ;
	char logo='M';
	public void egde() {
		// TODO Auto-generated method stub
		float version=100.2f;
		String name="Firefox";
		boolean visible=true ;
		int year=1998 ;
		char logo='M';
		System.out.println(version);
		System.out.println(visible);
	}
	public void chrome() {
		// TODO Auto-generated method stub
        int speed=70 ;
        System.out.println(speed);
	}
	
	public static void main(String[] args) {
		Firefox fx= new Firefox() ;
		System.err.println(fx.name);
		System.out.println(fx.name);
		fx.egde();
		fx.chrome();
		
	}
}
