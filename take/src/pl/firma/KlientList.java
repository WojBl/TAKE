package pl.firma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KlientList {
	List<Klient> klientList = new ArrayList<Klient>();
	
	public KlientList(List<Klient> klientList) {
		super();
		this.klientList = klientList;
	}
	
	public KlientList() {}
	
	public List<Klient> getKlientList() {
		return klientList;
	}
	
	public void setKlientList(List<Klient> klientList) {
		this.klientList = klientList;
	}
}