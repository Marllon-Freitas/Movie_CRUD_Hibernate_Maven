package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String category;
	private double price;
	private int durationMinutes;
	private String date;
	
	public void status(){
		System.out.println("nome: " + this.getTitle());
		System.out.println("categoria: " + this.getCategory());
		System.out.println("preco: " + this.getPrice());
		System.out.println("duração(minutos) :" + this.getDurationMinutes());

	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", category=" + category + ", price=" + price
				+ ", durationMinutes=" + durationMinutes + ", date=" + date + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
