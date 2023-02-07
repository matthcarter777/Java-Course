package entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitites.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orders = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("(dd/MM/yyyy)");
	
	public Order() {}

	public Order(Date moment, OrderStatus status,Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem order) {
		orders.add(order);
	}
	
	public void removeItem(OrderItem order) {
		orders.remove(order);
	}
	
	public double total() {
		double total = 0;
		for (OrderItem o: orders) {
			total += o.subTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " " + sdf2.format(client.getBirthDate()) + " - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		
		for (OrderItem o: orders) {
			sb.append(o.getProduct().getName() + ", $" + o.getPrice());
			sb.append(" Quantity: " + o.getQuantity());
			sb.append(" Subtotal: $" + o.subTotal() + " \n");
		}
		
		sb.append("Total price: #" + this.total());
		
		return sb.toString();
	}
	
	
	
}
