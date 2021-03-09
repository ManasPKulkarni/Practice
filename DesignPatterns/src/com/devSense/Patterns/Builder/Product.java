package com.devSense.Patterns.Builder;

public class Product {
	
	private String id;
	private String name;
	private String description;
	private double value;
	
	private Product (Builder builder) {
		setId(builder.id);
		setName(builder.name);
		setDescription(builder.description);
		setValue(builder.value);
	}
	
	public static Builder newProduct() {
		return new Builder();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public static class Builder{
		private String id;
		private String name;
		private String description;
		private double value;
		
		private Builder(){			
		}
		
		public Builder id(String id) {
			this.id = id;
			return this;			
		}
		
		public Builder name(String name) {
			return this.name(name);
		}
		
		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public Builder value(double value) {
			return this.value(value);
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
	

}
