package pl.kurs.firma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BusList {
	List<Bus> busList = new ArrayList<Bus>();
	
	public BusList(List<Bus> busList) {
		super();
		this.busList = busList;
	}
	
	public BusList() {}
	
	public List<Bus> getBusList() {
		return busList;
	}
	
	public void setBusList(List<Bus> busList) {
		this.busList = busList;
	}
}
