package ch15;

public class RunnableEx implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "==>" + i);
		}

	}

	public static void main(String[] args) {
		RunnableEx e1 = new RunnableEx();
		Thread t1 = new Thread(e1, "thread 1");
		Thread t2 = new Thread(e1, "thread 2");
		// 기본우선순위 5

		t1.setPriority(1); // 우선순위 최소값
		t2.setPriority(10); // 우선순위 최대값
		// 스레드의 우선순위 출력
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		t2.start();
	}

}
