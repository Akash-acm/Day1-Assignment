package assignments;

public class Computer {

	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;
	private Cpu cpu;
	
	public Computer(int size, String keyboardType, String mouseType, String processor) {
		this.monitor = new Monitor(size);
		this.keyboard = new Keyboard(keyboardType);
		this.mouse = new Mouse(mouseType);
		this.cpu =new Cpu(processor);
	}

	public String getComputer() {
		return monitor.getSize()+"  "+keyboard.getKeyboardType()+"  "+mouse.getMouseType()+"  "+cpu.getProcessor();
	}

}