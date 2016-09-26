	package pl.kurs.firma;

	import java.io.Serializable;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;
	
	
	@Entity
	@XmlRootElement
	public class Run implements Serializable{
		
		private static final long serialVersionUID = 1L;

		int id;
		int idStart;
		int idEnd;
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
		
		public void setIdStart(int idStart) {
			this.idStart = idStart;
		}
		
		public int getIdStart() {
			return idStart;
		}
		
		public void setidEnd(int idEnd) {
			this.idEnd = idEnd;
		}
		
		public int getidEnd() {
			return idEnd;
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