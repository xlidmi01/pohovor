package xlidmi01;

public class Main {

	public static void main(String[] args) {
	
		Router r1 = new Router("Mac1","IP1",50,"TP-link","R1");
		Router r2 = new Router("Mac2","IP2",50,"TP-link","R2");
		Router r3 = new Router("Mac3","IP3",50,"TP-link","R3");
		Router r4 = new Router("Mac4","IP4",50,"TP-link","R4");
		Router r5 = new Router("Mac5","IP5",50,"TP-link","R5");
		Router r6 = new Router("Mac6","IP6",50,"TP-link","R6");
		
		Map m = new Map();
		m.addLink(r1, r2);
		m.addLink(r2, r6);
		m.addLink(r3, r1);
		m.addLink(r4, r2);
		m.addLink(r4, r5);
		m.addLink(r5, r3);
		m.addLink(r6, r3);
		m.addLink(r6, r3);
		
		Path p = new Path(m, "R3");
		p.addRouter("R1");
		p.addRouter("R2");
		p.addRouter("R6");
		p.addRouter("R4");
		p.addRouter("R5");
				
		p.vypis();
	}

}
