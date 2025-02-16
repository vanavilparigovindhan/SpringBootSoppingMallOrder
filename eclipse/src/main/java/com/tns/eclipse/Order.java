package com.tns.eclipse;
reimport jakarta.persistence.*;
@Entity
@Table(name = "orders")
public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String customerName;
	    private String product;
	    private int quantity;
	    private double price;

	    public Order() {}

	    public Order(String customerName, String product, int quantity, double price) {
	        this.customerName = customerName;
	        this.product = product;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getCustomerName() { return customerName; }
	    public void setCustomerName(String customerName) { this.customerName = customerName; }

	    public String getProduct() { return product; }
	    public void setProduct(String product) { this.product = product; }

	    public int getQuantity() { return quantity; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }

	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }
	}
