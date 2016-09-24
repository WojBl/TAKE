package pl.firma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Przejazdy {
	int id;
	int idPrzejazdu;
	int idStart;
	int idCel;
	int idBus;
	int idKlient;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setIdPrzejazdu(int idPrzejazdu) {
		this.idPrzejazdu = idPrzejazdu;
	}
	
	public int getIdPrzejazdu() {
		return idPrzejazdu;
	}
	
	public void setIdStart(int idStart) {
		this.idStart = idStart;
	}
	
	public int getIdStart() {
		return idStart;
	}
	
	public void setIdCel(int idCel) {
		this.idCel = idCel;
	}
	
	public int getIdCel() {
		return idCel;
	}
	
	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}
	
	public int getIdBus() {
		return idBus;
	}
	
	public void setIdKlient(int idKlient) {
		this.idKlient = idKlient;
	}
	
	public int getIdKlient() {
		return idKlient;
	}
}