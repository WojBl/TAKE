package pl.firma;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Klient implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String surname;
	String pesel;
	String email;
	String phone;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setName(String temp) {
		this.name = temp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String temp) {
		this.surname = temp;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getPesel() {
		return pesel;
	}
	
	public void setPesel(String temp) {
		this.pesel = temp;
	}	

	public void setPhone(String temp) {
		this.phone = temp;
	}
	
	public String getPhone() {
		return phone;
	}
	
}



