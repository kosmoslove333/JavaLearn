package ch08;

public class Ex01 {
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private double  distance;
	public Ex01(int x1, int y1 , int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void calc(){
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));}
	public void print() {
		System.out.println("거리"+distance);
	}
	
	
	@Override
	public String toString() {
		return "Ex01 [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", distance=" + distance + "]";
	}

	public static void main(String[] args) {
		Ex01 e = new Ex01(5,10,25,35);
		e.calc();
		e.print();
		System.out.println(e);
		
	}

}
