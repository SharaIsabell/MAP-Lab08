package aplication;

import java.util.ArrayList;
import java.util.List;

import adapters.ListMap;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

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
	}

}
