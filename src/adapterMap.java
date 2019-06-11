import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class adapterMap implements Map {
	Map<String,String> mapa = new HashMap<>();
	
	
	public adapterMap(String[][] matriz){

		for(int i=0; i<matriz.length;i++) {
			mapa.put(matriz[i][0], matriz[i][1]);
		}
		
	}
	
	@Override
	public void clear() {
		mapa.clear();
	}


	@Override
	public boolean containsKey(Object key) {
		return mapa.containsKey(key);
	}


	@Override
	public boolean containsValue(Object value) {
		return mapa.containsKey(value);
	}


	@Override
	public Set entrySet() {
		return null;
	}


	@Override
	public Object get(Object key) {
		return mapa.get(key);
	}


	@Override
	public boolean isEmpty() {
		return mapa.isEmpty();
	}


	@Override
	public Set keySet() {
		return null;
	}


	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
	}


	@Override
	public Object remove(Object key) {
		return mapa.remove(key);
	}


	@Override
	public int size() {
		return mapa.size();
	}


	@Override
	public Collection values() {
		return mapa.values();
	}
	
	
}
