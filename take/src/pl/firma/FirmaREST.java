package pl.firma;

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
	
	//TODO tutaj implementujemy us�ugi, p�ki co 
	
	@Override
	@GET
	@Path("/places/{wolneMiejsca}/brand/{marka}/model/{model}/regNum/{regNum}")
	public void createBus(@PathParam("wolneMiejsca") int places, @PathParam("marka") String marka, @PathParam("model") String model, @PathParam("regNum") String regNum) {
		Bus bus = new Bus();
		bus.setBrand(marka);
		bus.setModel(model);
		bus.setFreePlaces(places);
		bus.setRegNumber(regNum);
		bean.createBus(bus);
	}
	
	

}
