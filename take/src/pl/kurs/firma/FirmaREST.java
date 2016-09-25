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
	@Path("/add_car/places/{wolneMiejsca}/brand/{marka}/model/{model}/regNum/{regNum}")
	public String createBus(@PathParam("wolneMiejsca") int places, @PathParam("marka") String marka, @PathParam("model") String model, @PathParam("regNum") String regNum) {
		Bus bus = new Bus();
		bus.setBrand(marka);
		bus.setModel(model);
		bus.setFreePlaces(places);
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
	@Path ("/getBuses")
	@Produces("application/json") /*poki co jest string, zeby obadac czy dziala*/
	public BusList getBuses() {
		List<Bus> lbus = bean.getBuses();
		BusList b = new BusList(lbus);
		return b;
	}
 
	

}
