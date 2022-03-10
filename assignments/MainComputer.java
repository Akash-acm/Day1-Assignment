package assignments;

public class MainComputer {
	public static void main(String[] args) {
		Computer[] c=new Computer[3];
		c[0]=new Computer(32,"Wired","Wireless","Ryzen 5");
		c[1]=new Computer(40,"Wireless","Wireless","Intel i7");
		c[2]=new Computer(24,"Wired","Wired","Itel i5");
	
		for (Computer computer : c) {
			System.out.println(computer.getComputer());
		}
	
	}

}

}
