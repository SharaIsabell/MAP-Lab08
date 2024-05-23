package adapters;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMap<K, V> implements Map<K, V>{
	private List<V> list;
	
	public ListMap(List<V> list) {
		this.list = list;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsValue(Object value) {
		return list.contains(value);
	}

	@Override
	public V get(Object key) {
	    if (!(key instanceof Integer)) {
	        throw new IllegalArgumentException("Parâmetro deve ser inteiro");
	    }
	    
	    return list.get((Integer) key);
		
	}

	@Override
	public V put(K key, V value) {
		if ((Integer) key > list.size() - 1) {
			list.add(value);
			return value;
		}
		return list.set((Integer) key, value);
	}

	@Override
	public V remove(Object key) {
		if (!(key instanceof Integer)) {
	        throw new IllegalArgumentException("Parâmetro deve ser inteiro");
	    }
		return list.remove((int)key);
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public Collection<V> values() {
		return list;
	}

	//Não pediu
	
	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		throw new UnsupportedOperationException();		
	}
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<K> keySet() {
		throw new UnsupportedOperationException();
	}

}
