package pl.firma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Rezerwacje {
	int id;
	int idPrzejazdu;
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
		
	public void setIdKlient(int idKlient) {
		this.idKlient = idKlient;
	}
	
	public int getIdKlient() {
		return idKlient;
	}
}