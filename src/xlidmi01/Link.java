package xlidmi01;

public class Link {
	
	private Router from;
	private Router to;
	
	public Link(Router from, Router to) {
		super();
		this.from = from;
		this.to = to;
	}

	public Router getFrom() {
		return from;
	}
	
	public void setFrom(Router from) {
		this.from = from;
	}
	
	public Router getTo() {
		return to;
	}
	
	public void setTo(Router to) {
		this.to = to;
	}
	
	
}
