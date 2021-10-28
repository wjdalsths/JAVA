package Abstruct_Interface;

import Abstruct_Interface.Computer;
import Abstruct_Interface.Controllable;
import Abstruct_Interface.TV;

public class S4ControllableDemo {
	public static void main(String[] args) {
		Controllable[] controllable= {new TV(),new Computer()};
		
		for(Controllable c:controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
		
	}
}
