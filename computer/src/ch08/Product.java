package ch08;

public class Product {
	private String name;
	private int price;
	private int amount;
	private String maker;
	private int money;
	
	Product(){}
	Product(String name, int price, int amount, String maker){
		this.name=name;
		this.price=price;
		this.amount=amount;
		this.maker=maker;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void calc() {
		money=price*amount;
	}
	public void print() {
		System.out.println("품명"+name);
		System.out.println("가격"+price);
		System.out.println("수량"+amount);
		System.out.println("제조사"+maker);
		System.out.println("총액"+money);
	}

}
