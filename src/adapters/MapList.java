package adapters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapList<E> implements List<E>{
	private Map<?, E> map;
	
	public MapList(Map<?, E> map) {
		this.map = map;
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return map.containsValue(o);
	}

	@Override
	public Iterator<E> iterator() {
		return map.values().iterator();
	}

	@Override
	public Object[] toArray() {
		return map.values().toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return map.values().toArray(a);
	}

	@Override
	public boolean add(E e) {
		map.put(null, e);
		return map.containsValue(e);
	}
	
	@Override
	public void clear() {
		map.clear();	
	}

	@Override
	public E get(int index) {
		return new ArrayList<>(map.values()).get(index);
	}
	
	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException("Não suportada");
	}

	@Override
	public boolean remove(Object o) {
		for(Map.Entry<?, E> m : map.entrySet()) {
			if(m.getValue().equals(o)) {
				map.remove(m.getKey());
				return true;
			}
		}
		return false;
	}
	
	@Override
	public E remove(int index) {
		int i = 0;
		for(Map.Entry<?, E> m : map.entrySet()) {
			if(i == index) {
				map.remove(map.remove(m.getKey(), m.getValue()));
				return m.getValue();
			}
			i++;
		}
		return null;
	}
	
	// Não pediu

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

}
