
public class Pair<K, V> {
	
	K key;
	V value;
	
	public void set(K k, V v) {
		key = k;
		value = v; 
	}
	
	public K getKey() {
		return this.key; 
	}
	
	public V getValue() {
		return this.value; 
	}
	
	public String toString() {
		return("[" + getKey() + ", " + getValue() + "]");
	}
	
	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<String, Integer>();
		pair1.set("Height", 36);
		System.out.println(pair1.toString());
		
		Pair<String, String> pair2 = new Pair<String, String>();
		pair2.set("Red", "Blue");
		System.out.println(pair2.toString());
	}

}
