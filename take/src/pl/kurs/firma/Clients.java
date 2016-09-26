package pl.kurs.firma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Clients {
	List<Client> clients = new ArrayList<Client>();
	
	public Clients(List<Client> clients) {
		super();
		this.clients = clients;
	}
	
	public Clients() {}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
}