package pl.firma;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Firma {
	
	public abstract void createBus(int places, String brand, String model, String regNum);
	
	//public abstract void deleteBus(int idc);
	
	public abstract Bus findBus(int idc);
	
	public abstract void updateBus(int idc);

}
