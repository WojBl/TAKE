package pl.kurs.firma;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Reservation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	Run run;
	Client client;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setRun(Run run) {
		this.run = run;
	}
	
	public Run getRun() {
		return run;
	}
		
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}
}