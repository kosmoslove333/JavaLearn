package ch11;

public class Drone implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("드론이륙");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("드론비행");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("드론착륙");

	}

}
