package xlidmi01;

import java.util.LinkedList;

public class Path {
	
	private Map map;
	private LinkedList<Router> r = new LinkedList<Router>();
	
	public Path(Map g, String key) {
        //super();
        this.map = g;
        Router u = g.getRouter(key);
        r.add(u);
    }
    
    public void addRouter(String router) {
        Router u = map.getRouter(router);
        Router last = r.getLast();
        r.add(u);
    }
    public void vypis() {
    	for (Router router : r) {
			System.out.println(router.getName());
		}
    }
}
