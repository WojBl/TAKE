package pl.kurs.firma;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

@Stateless
public class FirmaEJB {

	@PersistenceContext(name="firma")
	EntityManager manager;
	
	/***********************************************************************************************/
	//BUS
	/***********************************************************************************************/
	public void createBus(Bus bus) {
		manager.persist(bus);
		System.out.println("Stworzono autobus");
	}
	
	public void update(Bus bus) {
		bus = manager.merge(bus);
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
	//Place
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
	
	public Place findPlace(int id) {
		Place place = manager.find(Place.class, id);
		return place;
	}
	/***********************************************************************************************/
	//Client
	/***********************************************************************************************/
	public void createClient(Client client) {
		manager.persist(client);
		System.out.println("Stworzono clienta");
	}
	
	public void deleteClient(int id) {
		Client client = manager.find(Client.class, id);
		manager.remove(client);
	}
	
	public Client findClient(int id) {
		return manager.find(Client.class, id);
	}
	
	public List<Client> getClients() {
		Query q = manager.createQuery("select c from Client c ");
		List<Client> list = q.getResultList();
		return list;
	}
	
	public List<Client> findByName(String name) {
		Query q = manager.createQuery("select k from Client k where k.name like :name");
		q.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Client> lista =q.getResultList();
		return lista;
	}
	
	public List<Client> findBySurname(String surname) {
		Query q = manager.createQuery("select k from Client k where k.surname like :surname");
		q.setParameter("surname", surname);
		@SuppressWarnings("unchecked")
		List<Client> lista =q.getResultList();
		return lista;
	}
	
	public List<Client> findByFullName(String name, String surname) {
		Query q = manager.createQuery("select k from Client k where k.surname like :surname and k.name like :name");
		q.setParameter("surname", surname);
		q.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Client> lista =q.getResultList();
		return lista;
	}
	
	public List<Client> findByPesel(String pesel) {
		Query q = manager.createQuery("select k from Client k where k.pesel like :pesel");
		q.setParameter("pesel", pesel);
		@SuppressWarnings("unchecked")
		List<Client> lista =q.getResultList();
		return lista;
	}
	
	public void updateClient(Client client) {
		client = manager.merge(client);
		System.out.println("Zaktualizowano dane clienta");
	}
	
	/***********************************************************************************************/
	//Run
	/***********************************************************************************************/
	
	public void createRun(Run run) {
		manager.persist(run);
		System.out.println("Stworzono przejazd");
	}
	
	public void deleteRun(int id) {
		Run run = manager.find(Run.class, id);
		//manager.remove(parent);
		manager.remove(run);
	}
	
	public Run findRun(int id) {
		return manager.find(Run.class, id);
	}
	
	public void updateRun(Run run) {
		run = manager.merge(run);
		System.out.println("Zaktualizowano przejazd");
	}
	
	public List<Run> getRuns() {
		Query q = manager.createQuery("select r from Run r ");
		List<Run> list = q.getResultList();
		return list;
	}
	
	public List<Run> getRunsByBus(int busId) {
		Query q = manager.createQuery("select r from Run r, Bus b where b.idc = :busId");
		q.setParameter("busId", busId);
		@SuppressWarnings("unchecked")
		List<Run> list = q.getResultList();
		return list;
	}
	
	/***********************************************************************************************/
	//Reservation
	/***********************************************************************************************/
	
	public void createReservation(Reservation reservation) {
		manager.persist(reservation);
		System.out.println("Stworzono rezerwacje");
	}
	
	public void deleteReservation(int id) {
		Reservation reservation = manager.find(Reservation.class, id);
		manager.remove(reservation);
	}
	
	public List<Reservation> getReservations() {
		Query q = manager.createQuery("select re from Reservations re ");
		List<Reservation> list = q.getResultList();
		return list;
	}
	
	public Reservation findReservation(int id) {
		return manager.find(Reservation.class, id);
	}
	
	public void updateReservation(Reservation reservation) {
		reservation = manager.merge(reservation);
		System.out.println("Zaktualizowano rezerwacje");
	}
	
}
