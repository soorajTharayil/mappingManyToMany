package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Traveler {
	
	@Id
	String travelerName;
	
	@ManyToMany
	List<TouristPlace> place;

	public String getTravelerName() {
		return travelerName;
	}

	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

	public List<TouristPlace> getPlace() {
		return place;
	}

	public void setPlace(List<TouristPlace> place) {
		this.place = place;
	}
	

}
