package com.capella.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
public class OrderItem {/*
						 * private int quantity; private String productId;
						 * private BigDecimal price; private String title;
						 * 
						 * public int getQuantity() { return quantity; }
						 * 
						 * public void setQuantity(int quantity) { this.quantity
						 * = quantity; }
						 * 
						 * public String getProductId() { return productId; }
						 * 
						 * public void setProductId(String productId) {
						 * this.productId = productId; }
						 * 
						 * public BigDecimal getPrice() { return price; }
						 * 
						 * public void setPrice(BigDecimal price) { this.price =
						 * price; }
						 * 
						 * public String getTitle() { return title; }
						 * 
						 * public void setTitle(String title) { this.title =
						 * title; }
						 * 
						 * public String toString() { return "ProductID=" +
						 * productId + ", Quantity=" + quantity + ", Title='" +
						 * title + "', Price=" + price; }
						 */

	private HashMap<String, String> data = new HashMap<String, String>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderItem [data=" + data + "]";
	}
}