package Generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {

	private final Set<Par<K,V>> itens = new HashSet<>();

	public void adicionar(K key, V value) {
		if(key == null) return;
		
		Par<K, V> novoPar= new Par<K,V>(key,value);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);			
		}
		itens.add(novoPar);
	}
	
	public V getValue(K key) {
		if(key==null) return null;
		
		Optional<Par<K, V>> parOpcional = itens.stream()
				.filter(par-> key.equals(par.getKey())).findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValue() : null;
	}
}
