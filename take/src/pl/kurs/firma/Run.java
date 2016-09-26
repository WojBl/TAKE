	package pl.kurs.firma;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.xml.bind.annotation.XmlAttribute;
	import javax.xml.bind.annotation.XmlRootElement;
	import java.util.Date;

	@Entity
	@XmlRootElement
	public class Run {
		int id;
		int idStart;
		int idEnd;
		int idBus;
		Date dateStart;
		Date dateEnd;
		
		@Id
		@GeneratedValue
		@XmlAttribute
		public int getId() {
			return id;
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
		
		public void setIdBus(int idBus) {
			this.idBus = idBus;
		}
		
		public int getIdBus() {
			return idBus;
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
	}