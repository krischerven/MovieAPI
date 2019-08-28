package co.gc.movieapi.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="movies")
public final class Movie {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @NonNull long id;
	@NonNull String title;
	@NonNull String category;
	@NonNull int quantity;
	
	// constructors
	public Movie() {
		super();
	}
	
	public Movie(long _id, String _title, String _category, int _quantity) {
		super();
		id = _id;
		title = _title;
		category = _category;
		quantity = _quantity;
	}
	
	public Movie(String _title, String _category, int _quantity) {
		super();
		title = _title;
		category = _category;
		quantity = _quantity;
	}
	
	// getters
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// setters
	public void setId(long _id) {
		id = _id;
	}
	
	public void setTitle(String _title) {
		title = _title;
	}
	
	public void setCategory(String _category) {
		category = _category;
	}
	
	public void setQuantity(int _quantity) {
		quantity = _quantity;
	}
	
}
