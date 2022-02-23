package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("kim", "design", 1));
		list.add(new Student("park", "db", 2));
		list.add(new Student("song", "math", 3));
		System.out.println("Name\tMajor\tYear");
		for (Student s : list) {
			System.out.println(s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t");
		}
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t");
		}
	}

}
