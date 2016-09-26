package pl.kurs.firma;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

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
	@Path ("/get_places")
	@Produces("application/json")
	public List<Place> getPlaces() {
		List<Place> list = bean.getPlaces();
		return list;
	}

}
