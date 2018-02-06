
public interface Map<K,V>{
	public void put(K key,V value);
	public V get(K key);
	public int size();
	public void isEmpty();
	public boolean containsKey(K key);
	public boolean containsValue(V value);
}
