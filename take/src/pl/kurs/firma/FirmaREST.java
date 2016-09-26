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
import javax.xml.bind.JAXB;

import pl.kurs.komis.Car;

@Path("/firma")
@Stateless
public class FirmaREST implements Firma {
	
	@EJB
	FirmaEJB bean;
	
	@Override
	@GET
	@Path("/add_car/places/{miejsca}/brand/{marka}/model/{model}/regNum/{regNum}")
	public String createBus(@PathParam("miejsca") int places, @PathParam("marka") String marka, @PathParam("model") String model, @PathParam("regNum") String regNum) {
		Bus bus = new Bus();
		bus.setBrand(marka);
		bus.setModel(model);
		bus.setPlaces(places);
		bus.setRegNum(regNum);
		bean.createBus(bus);
		return "dodano busa";
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
	@Path ("/get_buses/id/{id}")
	@Produces("application/json")
	public Bus getBusById(@PathParam("id") int id) {
		Bus bus = bean.findBus(id);
		return bus;
	}
	
	@Override
	@GET
	@Path ("/delete_bus/id/{id}")
	public void deleteBus(@PathParam("id") int idc) {
		bean.deleteBus(idc);
	}
 
	
/*=====================================PLACE==================================================*/
	@Override
	@GET
	@Path("add_place/lat/{lat}/lon/{lon}/name/{name}")
	public String createPlace(@PathParam("lat") int lat, @PathParam("lon") int lon, @PathParam("name") String name) {
		Place place = new Place();
		place.setLat(lat);
		place.setLon(lon);
		place.setName(name);
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
	@Path ("/get_places/id/{id}")
	@Produces("application/json") 
	public Place getPlaceById(@PathParam("id") int id) {
		Place place = bean.findPlace(id);
		return place;
	}
	
	@Override
	@GET
	@Path ("/delete_place/id/{id}")
	@Produces("application/json")
	public String deletePlace(@PathParam("id") int id) {
		bean.deletePlace(id);
		return "usunieto miejsca";
	}
	
	/*========================================================================================*/
	
	@Override
	@POST
	@Path ("/add_client")
	public String addClient(InputStream is) {
		Client client = JAXB.unmarshal(is,Client.class);
		bean.createClient(client);
		return "dodano klienta";
	}
	
	@Override
	@GET
	@Path ("/get_client/id/{id}")
	@Produces("application/json")
	public Client getClientById(@PathParam("id")int id) {
		Client client = bean.findClient(id);
		return client;
	}
	
	@Override
	@GET
	@Path ("/delete_client/id/{id})")
	@Produces ("application/json")
	public String deleteClient(@PathParam("id")int id) {
		bean.deleteClient(id);
		return "usunieto klienta";
	}

	/*=============================================RUN=========================================*/
	
	@Override
	@GET
	@Path ("/add_run/id_start/{ids}/id_finish/{idf}/id_bus/{idb}/date_start/{dateS}/date_finish/{dateF}")
	public void addRun(@PathParam("ids") int ids, @PathParam("idf") int idf, @PathParam("idb") int idb,@PathParam("dateS") Date dateS, @PathParam("dateF") Date dateF) {
		Run run = new Run();
		run.setIdStart(ids);
		run.setdateEnd(dateF);
		run.setIdBus(idb);
		run.setdateStart(dateS);
		run.setdateEnd(dateF);
		bean.createRun(run);
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
	@Path("/delete_run/id/{id}")
	public String deleteRun(@PathParam("id") int id) {
		bean.deleteRun(id);
		return "usunieto przejazd";
	}
	
	/*===========================================Reservation===================================*/
	
	@Override
	@POST
	@Path("/add_reservation")
	public void addReservation(InputStream is) {
		Reservation res = JAXB.unmarshal(is,Reservation.class);
		bean.createReservation(res);
	}
	
	@Override
	@GET
	@Path("/get_reservation/id/{id}")
	@Produces("application/json")
	public Reservation getReservation(@PathParam("id") int id) {
		Reservation res = bean.findReservation(id);
		return res;
	}
	
	@Override
	@GET
	@Path("/delete_reservation/id/{id}")
	public String deleteReservation(@PathParam("id") int id) {
		bean.deleteReservation(id);
		return "usunieto rezerwacje";
	}
}
