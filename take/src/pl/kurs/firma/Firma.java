package pl.kurs.firma;

import java.util.Date;
import java.util.List;
import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Firma {
	
	public abstract String createBus(int places, String brand, String model, String regNum);
	
	public abstract void deleteBus(int idc);
	
	//public abstract void updateBus(int idc);
	
	public abstract BusList getBuses();
	
	public abstract Bus getBusById(int id);
	
	public abstract String createPlace(int lat, int lon, String name);
	
	//public abstract String getPlaceById(String name);
	
	public abstract List<Place> getPlaces();

	public abstract Place getPlaceById(int id);
	
	public abstract String deletePlace(int id);
	
	public abstract String addClient(InputStream is);
	
	public abstract Client getClientById(int id);
	
	public abstract String deleteClient(int id);
	
	public abstract void addRun(int ids, int idf, int idb, Date dateS, Date dateF);
	
	public abstract List<Run> getRuns();
	
	public abstract String deleteRun(int id);
	
	public abstract void addReservation(InputStream is);
	
	public abstract Reservation getReservation(int id);
	
	public abstract String deleteReservation(int id);
	
}
