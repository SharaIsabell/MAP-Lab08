package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import adapters.ListMap;

public class ListMapTest {

	static List<Integer> list;
	static ListMap<Integer, Integer> listMap;
	
	@BeforeClass
	public static void criarObjetos(){
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		listMap = new ListMap<>(list);
		listMap.put(4, 5);
	}
	
	@Test
	public void isEmpty() {
		assertFalse(listMap.isEmpty());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void containsKeyTest() {
		listMap.containsKey(3);
	}
	
	@Test
	public void containsValueTest() {
		assertTrue(listMap.containsValue(1));
	}
	
	@Test
	public void getTest() {
		assertEquals((Integer) 1, listMap.get(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getTestException() {
		listMap.get("1");
	}
	
	@Test
	public void putTest() {
		assertEquals((Integer) 8, listMap.put(5, 8));
	}
	
	@Test
	public void removeTest() {
		assertEquals((Integer) 2, listMap.remove(1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void removeTestException() {
		listMap.remove("First");
	}
	
	@Test
	public void sizeTest() {
		assertEquals(5, listMap.size());
	}

	@Test
	public void valuesTest() {
		List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 8));
		assertEquals(list, listMap.values());
	}
}
