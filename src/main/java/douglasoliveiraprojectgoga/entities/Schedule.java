package douglasoliveiraprojectgoga.entities;

import java.io.Serializable;
import java.time.Instant;

public class Schedule implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant timetable;
	private String status;
	
	private Product product;
	
	private User user;
	
	public Schedule() {}

	public Schedule(Long id, Instant timetable, String status, Product product, User user) {
		super();
		this.id = id;
		this.timetable = timetable;
		this.status = status;
		this.product = product;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public Instant getTimetable() {
		return timetable;
	}

	public String getStatus() {
		return status;
	}

	public Product getProduct() {
		return product;
	}

	public User getUser() {
		return user;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTimetable(Instant timetable) {
		this.timetable = timetable;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
