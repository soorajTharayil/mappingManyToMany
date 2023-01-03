package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		TouristPlace place=new TouristPlace();
		place.setPlaceName("Munnar");
		
		TouristPlace place2=new TouristPlace();
		place2.setPlaceName("Mysore");
		
		TouristPlace place3=new TouristPlace();
		place3.setPlaceName("Ooty");
		
		List<TouristPlace> l=new ArrayList<TouristPlace> ();
		l.add(place);
		l.add(place2);
		l.add(place3);
		
		Traveler traveler=new Traveler();
		traveler.setTravelerName("Sooraj");
		traveler.setPlace(l);
		
		Traveler traveler2=new Traveler();
		traveler2.setTravelerName("Athul");
		traveler2.setPlace(l);
		
		Traveler traveler3=new Traveler();
		traveler3.setTravelerName("Arjun");
		traveler3.setPlace(l);
		
		entityTransaction.begin();
		entityManager.persist(place);
		entityManager.persist(place2);
		entityManager.persist(place3);
		entityManager.persist(traveler);
		entityManager.persist(traveler2);
		entityManager.persist(traveler3);
		entityTransaction.commit();
		
		

	}

}
