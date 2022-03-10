package assignments;

public class Hello {
	
	public void hell(int i) {
		System.out.println("5 is integer");
	}
	public void hell(byte i) {
		System.out.println("5 is byte");
	}
	public void hell(short i) {
		System.out.println("5 is short");
	}
	public void hell(long i) {
		System.out.println("5 is long");
	}
	public static void main(String[] args) {
		
		Hello h= new Hello();
		h.hell(5);
	}
	

}
