package netServ.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentClass {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("70A01A6");
		list1.add("70A01B6");
		list1.add("70A01C6");
		list1.add("70A01D6");
		list1.add("70A01E6");
		list1.add("70A01F6");
		list1.add("70A01G6");
		list1.add("70A01H6");
		list1.add("70A01I6");
		list1.add("70A01J6");

		// ArrayList<String> list2=new ArrayList<String>();
		list1.add("70A02A5");
		list1.add("70A02B5");
		list1.add("70A02C5");
		list1.add("70A02D5");
		list1.add("70A02E5");
		list1.add("70A02F5");
		list1.add("70A02G5");
		list1.add("70A02H5");

		// Map<String,ArrayList<String>> map = new HashMap<>();
		Map<String, String> map = new HashMap<>();
		// List<String> keyValue1=new ArrayList<String>();

		System.out.println("first list " + list1);

		for (int i = 0; i < list1.size(); i++) {

			String key = list1.get(i).substring(0, 5);

			String value = list1.get(i).substring(5, 7);
			// keyValue1.add(value);
			if (map.containsKey(key)) {
				value = map.get(key) + "," + value;
				map.put(key, value);
			} else {
				map.put(key, value);
			}

		}

		System.out.println("\n" + "map           " + map);
		map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
	}

}
