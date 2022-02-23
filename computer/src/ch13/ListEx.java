package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("one");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4); //인덱스 3 자리에 4를 삽입한다
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			//get(인덱스)
			System.out.println(list.get(i) + "\t");
		}
	}

}
