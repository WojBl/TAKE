package pl.kurs.firma;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RunList {
	List<Run> runList = new ArrayList<Run>();
	
	public RunList(List<Run> runList) {
		super();
		this.runList = runList;
	}
	
	public RunList() {}
	
	public void add(Run run) {
		runList.add(run);
	}
	
	public List<Run> getBusList() {
		return runList;
	}
	
	public void setBusList(List<Run> runList) {
		this.runList = runList;
	}
}