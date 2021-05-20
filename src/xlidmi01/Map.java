package xlidmi01;

import java.util.HashMap;
import java.util.Vector;

public class Map {
	
	private Vector<Link> links = new Vector<>();
	private HashMap<String, Router> routers = new HashMap<String, Router>();
	
	public void addRouter(Router r, String name) {
		routers.put(name, r);
	}
	public void addLink(Router from, Router to) {
		
		Link link = new Link(from, to);
		routers.put(to.getName(), to);
		routers.put(from.getName(), from);
		links.add(link); 
	}

	public Router getRouter(String key) {		
		return routers.get(key);
	}
}
