package co.grandcircus.coffeeshop.model;

//a simple class with getters and setters can be referred to as:
//1. java bean
//2. POJO plain old java object
//3. DTO data transfer object - based off DAO design pattern


public class Item {

	private String name;
	
	private String category;
	private String description;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String name, String category, String description) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", category=" + category + ", description=" + description + "]";
	}
	

	
}
