package pl.firma;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FirmaEJB {

	@PersistenceContext(name="firma")
	EntityManager manager;
	
	public void createBus(Bus bus) {
		manager.persist(bus);
		System.out.println("Stworzono autobus");
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

	
	
}
