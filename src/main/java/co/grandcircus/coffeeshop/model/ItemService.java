package co.grandcircus.coffeeshop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ItemService {
	private List<Item> items = new ArrayList<>();
	
	public ItemService() {
		items.add(new Item("dark roast", "coffee", "good coffee"));
		items.add(new Item("light roast", "coffee", "good coffee"));
		items.add(new Item("medium roast", "coffee", "good coffee"));
		items.add(new Item("cappuccino", "coffee", "good coffee"));
		items.add(new Item("chai tea", "tea", "good tea"));
		items.add(new Item("green tea", "tea", "good tea"));
		items.add(new Item("red bull", "energy drink", "gives you wings"));

	}
	
	//get items
	public List<Item> getAllItems(){
		return items;
	}
	//method to add items
	public void addItems(Item item) {
		items.add(item);
	}
	
	public List<Item> searchByCat(String cat){
		List<Item> matches = new ArrayList<>();
		
		for (Item i: items) {
			if (i.getCategory().equalsIgnoreCase(cat)) {
				matches.add(i);
			}
		}
		return matches;
	}
}
