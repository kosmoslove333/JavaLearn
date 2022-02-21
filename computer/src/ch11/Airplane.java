package ch11;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("이륙");

	}

	@Override
	public void fly() {
		System.out.println("비행");

	}

	@Override
	public void land() {
	System.out.println("착륙");

	}

}
