package assignments;

public class StaticAssignQues {
	private static int id;
	public static final String NAME="Akash";
	public static void main(String[] args) {
		id=100;
		StaticAssignQues s = new StaticAssignQues();
		System.out.println(id + StaticAssignQues.NAME);
	
		System.out.println(s.method1());
		System.out.println(s.method2());
	}

}
