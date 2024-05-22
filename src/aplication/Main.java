package aplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapters.ListMap;
import adapters.MapList;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("First", 1);
		map.put("Second", 2);
		map.put("Third", 3);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1,"First");
		map2.put(2, "Second");
		map2.put(3, "Third");

		//testando os métodos de ListMap
		ListMap<Integer, Integer> listMap = new ListMap<>(list);
		System.out.println(listMap.size());
		System.out.println(listMap.isEmpty());
		System.out.println(listMap.containsValue(2));
		System.out.println(listMap.get(0));
		listMap.put(1, 5);
		System.out.println(listMap.get(1));
		System.out.println(listMap.remove(2));
		System.out.println(listMap.size());
		
		//testando os métodos de MapList
		MapList<Integer> mapList = new MapList<>(map);
		MapList<String> mapList2 = new MapList<>(map2);
		mapList.add(4);
		System.out.println(mapList.contains(4));
		
		System.out.println();
		System.out.println(mapList2.remove("Second"));
		System.out.println(mapList2.contains("Second"));
		mapList2.remove(0);
		System.out.println(mapList2.contains("First"));
		
	}

}
