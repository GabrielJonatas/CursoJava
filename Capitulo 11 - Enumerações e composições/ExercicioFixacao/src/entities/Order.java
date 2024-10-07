package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment = new Date();
	private OrderStatus status;
	private Client client;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(Client client, OrderStatus status) {
		super();
		this.status = status;
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem o: items) {
			total += o.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " ");
		sb.append("(" + sdf2.format(client.getBirthDate()) + ")");
		sb.append(" - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for(OrderItem item: items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", this.total()));
		return sb.toString();
	}
}
