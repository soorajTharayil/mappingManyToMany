package manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TouristPlace {

	@Id
	String placeName;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
}
