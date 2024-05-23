package testes;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import adapters.MapList;

public class MapListTest {

	static Map<String, Integer> map;
	static MapList<Integer> mapList;
	
	@BeforeClass
	public static void criarObjetos(){
		map = new HashMap<>();
		map.put("First", 1);
		map.put("Second", 2);
		map.put("Third", 3);
		mapList = new MapList<>(map);
	}
	
	@Test
	public void sizeTest() {
		assertEquals(4, mapList.size());
	}
	
	@Test
	public void isEmptyTest() {
		assertFalse(mapList.isEmpty());
	}
	
	@Test
	public void containsTest() {
		assertTrue(mapList.contains(2));
	}
	
	@Test
	public void iteratorTest() {
		Iterator<Integer> it = mapList.iterator();
		assertEquals((Integer) 10, it.next());
	}
	
	@Test
	public void toArrayTest() {
		assertEquals(3, mapList.toArray()[1]);
	}
	
	@Test
	public void addTest() {
		assertTrue(mapList.add(10));
	}
	
	@Test
	public void getTest() {
		assertEquals((Integer) 10, mapList.get(0));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void addTestException() {
		mapList.add(10, 5);
	}
	
	@Test
	public void removeIndexTest() {
		assertEquals(null, mapList.remove(20));
	}
	
	@Test
	public void removeObjectTest() {
		assertFalse(mapList.remove((Integer) 20));
	}

}
