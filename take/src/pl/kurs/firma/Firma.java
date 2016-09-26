package pl.kurs.firma;

import java.util.Date;
import java.util.List;
import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Firma {
	
	public abstract String createBus(InputStream is);
	
	public abstract String updateBus(InputStream is);
	
	public abstract void deleteBus(int idc);
	
	public abstract BusList getBuses();
	
	public abstract Bus getBusById(int id);
	
	public abstract String createPlace(InputStream is);
	
	public abstract List<Place> getPlaces();

	public abstract Place getPlaceById(int id);
	
	public abstract String deletePlace(int id);
	
	public abstract String createClient(InputStream is);
	
	public abstract Client getClientById(int id);
	
	public abstract String deleteClient(int id);
	
	public abstract String createRun(InputStream is);
	
	public abstract List<Run> getRuns();
	
	public abstract String deleteRun(int id);
	
	public abstract void createReservation(InputStream is);
	
	public abstract Reservation getReservation(int id);
	
	public abstract String deleteReservation(int id);
	
}
