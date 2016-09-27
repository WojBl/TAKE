	package pl.kurs.firma;

	import java.io.Serializable;	
	
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;
	
	
	@Entity
	@XmlRootElement
	public class Run implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		@Column(name="id", unique=true)
		int id;
		@ManyToOne
		@JoinColumn(name="place_id")
		Place start;
		@ManyToOne
		@JoinColumn(name="place_id")
		Place end;
		@ManyToOne
		@JoinColumn(name="bus_id")
		Bus bus;
		Date dateStart;
		Date dateEnd;
		String description;
		String img;
		
		@Id
		@GeneratedValue
		@XmlAttribute
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setPlaceStart(Place place) {
			this.start = place;
		}
		
		public void setPlaceEnd(Place place) {
			this.start = place;
		}
		
		public Place getPlaceStart() {
			return start;
		}
		
		public Place getPlaceEnd() {
			return end;
		}
		
		public void setBus(Bus bus) {
			this.bus = bus;
		}
		
		public Bus getBus() {
			return bus;
		}
		
		public void setdateStart(Date dateStart) {
			this.dateStart = dateStart;
		}
		
		public Date getdateStart() {
			return dateStart;
		}
		
		public void setdateEnd(Date dateEnd) {
			this.dateEnd = dateEnd;
		}
		
		public Date getdateEnd() {
			return dateEnd;
		}
		
		public String getDesc() {
			return description;
		}
		
		public void setDesc(String description) {
			this.description = description;
		}

		public void setImg(String img) {
			this.img = img;
		}
		
		public String getImg() {
			return img;
		}
		
		
	}