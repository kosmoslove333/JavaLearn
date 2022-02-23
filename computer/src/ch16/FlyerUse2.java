package ch16;

public class FlyerUse2 {
	public static void main(String[] args) {
		Flyer2 f = new Flyer2() {

			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("takeoff");
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("land");
			}

		};
		
		f.takeOff();
		f.fly();
		f.land();
	}
}
