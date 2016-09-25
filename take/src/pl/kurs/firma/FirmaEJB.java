package pl.kurs.firma;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class FirmaEJB {

	@PersistenceContext(name="firma")
	EntityManager manager;
	
	public void createBus(Bus bus) {
		manager.persist(bus);
		System.out.println("Stworzono autobus");
	}
	
	public List<Bus> getBuses() {
		Query q = manager.createQuery("select b from Bus b ");
		List<Bus> list = q.getResultList();
		System.out.println("Zwrocono autobusy");
		return list;
		
	}
	
	public void deleteBus(int idc) {
		Bus bus = manager.find(Bus.class, idc);
		manager.remove(bus);
	}

	public Bus findBus(int idc) {
		return manager.find(Bus.class, idc);
	}
	
	public void updateBus(Bus bus) {
		bus = manager.merge(bus);
		System.out.println("Zaktualizowano pojazd");
	}
	
/***********************************************************************************************/

	public void createPlace(Place place) {
		manager.persist(place);
		System.out.println("Stworzono miejsce");
	}
	
	public void deletePlace(int idp) {
		Place place = manager.find(Place.class, idp);
		manager.remove(place);
	}
	
	public List<Place> getPlaces() {
		Query q = manager.createQuery("select p from Place p");
		List<Place> list = q.getResultList();
		System.out.println("Zwrocono miejsca");
		return list;
	}
	
}
