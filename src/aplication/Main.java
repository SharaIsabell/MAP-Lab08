package aplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

		// Usando os métodos de ListMap
		ListMap<Integer, Integer> listMap = new ListMap<>(list);
		
		System.out.println("MapList");
		System.out.println("Tamanho: " + listMap.size());
		System.out.println("Está vazio? " + listMap.isEmpty());
		System.out.println("O listMap contém o valor 2? " + listMap.containsValue(2));
		System.out.println("Valor do index 0: " + listMap.get(0));
		listMap.put(1, 5); // Adicionando um elemento no ListMap
		System.out.println("Removendo o valor " + listMap.remove(2)); // Removendo um elemento pelo index
		
		System.out.println("Valores do ListMap: ");
		for (int valor : listMap.values()) 
			System.out.println(valor);
		
		listMap.clear();
		System.out.println("Está vazio? " + listMap.isEmpty());
		
		System.out.println();
		
		// Usando os métodos de MapList
		MapList<Integer> mapList = new MapList<>(map);
		MapList<String> mapList2 = new MapList<>(map2);
		
		System.out.println("ListMap");
		System.out.println("Tamanho do mapList: " + mapList.size());
		System.out.println("Está vazio? " + mapList.isEmpty());
		mapList.add(4);
		System.out.println("O mapList contém o valor 4? " + mapList.contains(4));
		
		System.out.println("Removeu o elemento Second? " + mapList2.remove("Second")); // Remove pelo elemento
		System.out.println("O mapList contém o elemento Second? " + mapList2.contains("Second"));
		mapList2.remove(0); // Remove pelo index
		System.out.println("O mapList contém o elemento First? " + mapList2.contains("First"));
		
		System.out.println("Valor do elemento do index 0: " + mapList2.get(0));
		
		System.out.println("Iterator:");
		Iterator<Integer> it = mapList.iterator();
		
		while (it.hasNext()) {
            int elemento = it.next();
            System.out.println(elemento);
        }
		
		System.out.println("toArray: ");
		for (Object valor : mapList.toArray()) {
			System.out.println(valor);
		}
			
		mapList.clear();
		System.out.println("Está vazio? " + mapList.isEmpty());
	}

}
