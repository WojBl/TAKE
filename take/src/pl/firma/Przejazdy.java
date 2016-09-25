	package pl.firma;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.xml.bind.annotation.XmlAttribute;
	import javax.xml.bind.annotation.XmlRootElement;
	import java.util.Date;

	@Entity
	@XmlRootElement
	public class Przejazdy {
		int id;
		int idStart;
		int idCel;
		int idBus;
		Date dataStart;
		Date dataKoniec;
		
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
		
		public void setIdCel(int idCel) {
			this.idCel = idCel;
		}
		
		public int getIdCel() {
			return idCel;
		}
		
		public void setIdBus(int idBus) {
			this.idBus = idBus;
		}
		
		public int getIdBus() {
			return idBus;
		}
		
		public void setDataStart(Date dataStart) {
			this.dataStart = dataStart;
		}
		
		public Date getDataStart() {
			return dataStart;
		}
		
		public void setDataKoniec(Date dataKoniec) {
			this.dataKoniec = dataKoniec;
		}
		
		public Date getDataKoniec() {
			return dataKoniec;
		}
	}