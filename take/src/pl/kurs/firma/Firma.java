package pl.kurs.firma;

import java.util.Date;
import java.util.List;
import java.io.InputStream;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

@Local
public interface Firma {
	
	public abstract String crRun(int idb,int idps,int idpe, Date start, Date end);
	
	public abstract String createBus(InputStream is);
	
	public abstract String updateBus(InputStream is);
	
	public abstract void deleteBus(int idc);
	
	public abstract List<Bus> getBuses();
	
	public abstract Bus getBusById(int id);
	
	public abstract String createPlace(InputStream is);
	
	public abstract List<Place> getPlaces();

	public abstract Place getPlaceById(int id);
	
	public abstract String deletePlace(int id);
	
	public abstract String createClient(InputStream is);
	
	public abstract Client getClientById(int id);
	
	public List<Client> getClients();
	
	public abstract String deleteClient(int id);
	
	public abstract String createRun(InputStream is);
	
	public abstract List<Run> getRuns();
	
	public abstract String deleteRun(int id);
	
	public abstract void createReservation(InputStream is);
	
	public abstract void crReservation(int idc, int idr);
	
	public abstract Reservation getReservation(int id);
	
	public abstract String deleteReservation(int id);
	
	public List<Reservation> getReservations();
	
	public abstract List<Run> getRunById(int id);
	
	public abstract List<Reservation> getReservationByRun(int id);
	
}
