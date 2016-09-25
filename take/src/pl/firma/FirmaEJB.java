package pl.firma;

import java.util.List;
import java.util.Date;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.kurs.komis.Car;

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
	
	public void createKlient(Klient klient) {
		manager.persist(klient);
		System.out.println("Stworzono klienta");
	}
	
	public void deleteKlient(int id) {
		Klient klient = manager.find(Klient.class, id);
		manager.remove(klient);
	}
	
	public Klient findKlient(int id) {
		return manager.find(Klient.class, id);
	}
	
	public List<Klient> findByName(String name) {
		Query q = manager.createQuery("select k from Klient k where k.name like :name");
		q.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Klient> lista =q.getResultList();
		return lista;
	}
	
	public List<Klient> findBySurname(String surname) {
		Query q = manager.createQuery("select k from Klient k where k.surname like :surname");
		q.setParameter("surname", surname);
		@SuppressWarnings("unchecked")
		List<Klient> lista =q.getResultList();
		return lista;
	}
	
	public List<Klient> findByFullName(String name, String surname) {
		Query q = manager.createQuery("select k from Klient k where k.surname like :surname and k.name like :name");
		q.setParameter("surname", surname);
		q.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Klient> lista =q.getResultList();
		return lista;
	}
	
	public List<Klient> findByPesel(String pesel) {
		Query q = manager.createQuery("select k from Klient k where k.pesel like :pesel");
		q.setParameter("pesel", pesel);
		@SuppressWarnings("unchecked")
		List<Klient> lista =q.getResultList();
		return lista;
	}
	
	public void updateKlient(Klient klient) {
		klient = manager.merge(klient);
		System.out.println("Zaktualizowano dane klienta");
	}
	
	/***********************************************************************************************/
	
	public void createPrzejazdy(Przejazdy przejazdy) {
		manager.persist(przejazdy);
		System.out.println("Stworzono przejazd");
	}
	
	public void deletePrzejazdy(int id) {
		Przejazdy przejazdy = manager.find(Przejazdy.class, id);
		manager.remove(przejazdy);
	}
	
	public Przejazdy findPrzejazdy(int id) {
		return manager.find(Przejazdy.class, id);
	}
	
	public void updatePrzejazdy(Przejazdy przejazdy) {
		przejazdy = manager.merge(przejazdy);
		System.out.println("Zaktualizowano przejazd");
	}
	
	
	
}
