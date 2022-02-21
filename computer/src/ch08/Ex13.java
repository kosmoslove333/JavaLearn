package ch08;

public class Ex13 {
	public static void main(String[] args) {
		if(args.length==0) {
		System.out.println("파라미터를 입력하세요");
		System.exit(0);}else {
		
		
		int n=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1; 1<=n; i++) {sum+=i;}
		System.out.println("합계:"+sum);}}
	
}

