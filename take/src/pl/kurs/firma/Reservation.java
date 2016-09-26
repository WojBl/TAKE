package pl.kurs.firma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Reservation {
	int id;
	int idRun;
	int idClient;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setIdRun(int idRun) {
		this.idRun = idRun;
	}
	
	public int getIdRun() {
		return idRun;
	}
		
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public int getIdClient() {
		return idClient;
	}
}