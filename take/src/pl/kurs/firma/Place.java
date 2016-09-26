package pl.kurs.firma;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Place implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double lat;
	double lon;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public double getLon() {
		return lon;
	}
	
	
}
