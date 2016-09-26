package pl.kurs.firma;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Bus implements Serializable {
	private static final long serialVersionUID = 1L;
	int idc;
	int places;
	int freePlaces;
	String brand;
	String model;
	String regNum;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getId() {
		return idc;
	}
	
	public void setPlaces(int temp) {
		this.places = temp;
	}
	
	public int getPlaces() {
		return places;
	}
	
	public void setFreePlaces(int temp) {
		this.freePlaces = temp;
	}
	
	public int getFreePlaces() {
		return freePlaces;
	}
	
	public void setBrand(String tempBrand) {
		this.brand = tempBrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String tempModel) {
		this.model = tempModel;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	
	public String getRegNum() {
		return regNum;
	}
	
	public void setId(int id) {
		this.idc = id;
	}
}



