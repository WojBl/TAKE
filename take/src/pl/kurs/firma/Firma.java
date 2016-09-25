package pl.kurs.firma;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Firma {
	
	public abstract String createBus(int places, String brand, String model, String regNum);
	
	//public abstract void deleteBus(int idc);
	
	//public abstract Bus findBus(int idc);
	
	//public abstract void updateBus(int idc);
	
	public abstract BusList getBuses();
	
	public abstract String createPlace(int lat, int lon, String name);
	
	//public abstract String findPlace(String name);

}
