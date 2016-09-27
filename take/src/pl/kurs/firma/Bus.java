package pl.kurs.firma;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Bus implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="idc", unique=true)
	int idc;
	int places;
	int freePlaces;
	String brand;
	String model;
	String regNum;
	String description;
	String img;
	@OneToMany(mappedBy="bus")
	List<Run> runs;
	
	@OneToMany(mappedBy="bus")
	List<Reservation> res;
	
	public void setRes(List<Reservation> res) {
		this.res = res;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonIgnore
	public List<Reservation> getRes() {
		return res;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonIgnore
	public List<Run> getRuns() {
		return runs;
	}
	
	public void setRuns(List<Run> runs) {
		this.runs = runs;
	}
	
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



