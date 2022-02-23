package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map= new HashMap<>();
		map.put("apple","사과");//key,value 자료입력
		System.out.println(map.get("apple"));//출력 get(key)
		map.put("grape", "포도");
		map.put("peach", "배");
		//put(key,value) 입력
		System.out.println(map);
		String input ="grape";
		System.out.println(input + "==>"+map.get(input));
		
		//순환
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {//다음 요소가 있으면 true
			String key = iterator.next();
			System.out.println("key=" +key);
			System.out.println(",value=" +map.get(key));
		}
	}

}
