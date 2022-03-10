package assignments;

public class OverloadingAssign {
	

	int a,b,c;
	float d;
	public void add()
	{
	System.out.println("Nothing to add");
	}
	public void add(int a,int b) {
	System.out.println("Method 2 will execute");
	}
	public void add(int a,int b,int c) {
	System.out.println("Method 3 will execute ");
	}
	public void add(int a,float d) {
	System.out.println("Method 4 will execute");
	}



	public static void main(String[] args) {
	
	OverloadingAssign ol=new OverloadingAssign();
	ol.add();
	ol.add(10,4);
	ol.add(12,4,8);
	ol.add(5,7.4f);
	}



	}