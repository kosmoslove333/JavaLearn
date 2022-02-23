package ch15;

public class ATM extends Thread{
	private int deposit = 100000;
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			withdraw(10000);
		}
	
	}
	//synchronized 동기화 - 순서대로 처리하는 영역
	public synchronized void withdraw(int money) {
		String name = Thread.currentThread().getName();
		if(deposit >0) {
			deposit-=money;
			System.out.println(name+"-잔액"+deposit);
		}else {
			System.out.println(name +"-잔액이 없습니다.");
		}
	}

}
