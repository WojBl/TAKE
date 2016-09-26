package pl.kurs.firma;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXB;

import pl.kurs.komis.Car;


@Path("/firma")
@Stateless
public class FirmaREST implements Firma {
	
	@EJB
	FirmaEJB bean;
	
	@Override
	@POST
	@Path("/add_bus")
	public String createBus(InputStream is) {
		Bus bus = JAXB.unmarshal(is,Bus.class);
		bean.createBus(bus);
		return "dodano busa";
	}
	
	@Override
	@POST
	@Path("/update_bus")
	public String updateBus(InputStream is) {
		try {
			Bus newbus = (Bus) JAXB.unmarshal(is,Bus.class);
			bean.update(newbus);
			return "bus updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "bus not updated :(";
		}
	}

	@Override
	@GET
	@Path ("/get_buses")
	@Produces("application/json")
	public BusList getBuses() {
		List<Bus> lbus = bean.getBuses();
		BusList b = new BusList(lbus);
		return b;
	}
	
	@Override
	@GET
	@Path ("/get_buses/{id}")
	@Produces("application/json")
	public Bus getBusById(@PathParam("id") int id) {
		Bus bus = bean.findBus(id);
		return bus;
	}
	
	@Override
	@GET
	@Path ("/delete_bus/{id}")
	public void deleteBus(@PathParam("id") int idc) {
		bean.deleteBus(idc);
	}
 
	
/*=====================================PLACE==================================================*/
	@Override
	@POST
	@Path("/add_place")
	public String createPlace(InputStream is) {
		Place place = JAXB.unmarshal(is,Place.class);
		bean.createPlace(place);
		return "dodano miejsce";
	}
	
	@Override
	@GET
	@Path ("/get_places")
	@Produces("application/json")
	public List<Place> getPlaces() {
		List<Place> list = bean.getPlaces();
		return list;
	}
	
	@Override
	@GET
	@Path ("/get_places/{id}")
	@Produces("application/json") 
	public Place getPlaceById(@PathParam("id") int id) {
		Place place = bean.findPlace(id);
		return place;
	}
	
	@Override
	@GET
	@Path ("/delete_place/{id}")
	@Produces("application/json")
	public String deletePlace(@PathParam("id") int id) {
		bean.deletePlace(id);
		return "usunieto miejsca";
	}
	
	/*========================================================================================*/
	
	@Override
	@POST
	@Path ("/add_client")
	public String createClient(InputStream is) {
		Client client = JAXB.unmarshal(is,Client.class);
		bean.createClient(client);
		return "dodano klienta";
	}
	
	@Override
	@GET
	@Path ("/get_client/{id}")
	@Produces("application/json")
	public Client getClientById(@PathParam("id")int id) {
		Client client = bean.findClient(id);
		return client;
	}
	
	@Override
	@GET
	@Path ("/delete_client/{id})")
	@Produces ("application/json")
	public String deleteClient(@PathParam("id")int id) {
		bean.deleteClient(id);
		return "usunieto klienta";
	}

	/*=============================================RUN=========================================*/
	
	@Override
	@POST
	@Path ("/add_run")
	public String createRun(InputStream is) {
		Run run = JAXB.unmarshal(is,Run.class);
		bean.createRun(run);
		return "dodano przejazd!";
	}
	
	@Override
	@GET
	@Path("/get_runs")
	@Produces("application/json")
	public List<Run> getRuns() {
		List<Run> list = bean.getRuns();
		return list;
	}
	
	@Override
	@GET
	@Path("/delete_run/{id}")
	public String deleteRun(@PathParam("id") int id) {
		bean.deleteRun(id);
		return "usunieto przejazd";
	}
	
	/*===========================================Reservation===================================*/
	
	@Override
	@POST
	@Path("/add_reservation")
	public void createReservation(InputStream is) {
		Reservation res = JAXB.unmarshal(is,Reservation.class);
		bean.createReservation(res);
	}
	
	@Override
	@GET
	@Path("/get_reservation/{id}")
	@Produces("application/json")
	public Reservation getReservation(@PathParam("id") int id) {
		Reservation res = bean.findReservation(id);
		return res;
	}
	
	@Override
	@GET
	@Path("/delete_reservation/{id}")
	public String deleteReservation(@PathParam("id") int id) {
		bean.deleteReservation(id);
		return "usunieto rezerwacje";
	}
}
