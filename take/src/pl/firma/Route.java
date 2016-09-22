package pl.firma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Route {
	List<Place> route = new ArrayList<Place>();
	
	public Route(List<Place> route) {
		super();
		this.route = route;
	}
	
	public Route() {}
	
	public List<Place> getRoute() {
		return route;
	}
	
	public void setRoute(List<Place> route) {
		this.route = route;
	}
}
