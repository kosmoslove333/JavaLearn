package ch08;

public class Ex12 {
	public static void main(String[] args) {
		Product [] p = {
				new Product("TV",100,10,"LG"),
				new Product("냉장고",150,15,"삼성"),
				new Product("에어컨",80,20,"대우"),
				new Product("세탁기",90,25,"LG"),
		};
		for(int i=0; i<p.length; i++){
			p[i].calc();
			p[i].print();
			System.out.println();
		}
	}

}
