package xlidmi01;

import java.util.Vector;

public class Router {
	
	private String MAC_address;
	private String IP_address;
	private int speed;
	private String company; 
	private String name;
	
	Vector<Router> connectionsIN = new Vector<>();
	
	Vector<Router> connectionsOUT = new Vector<>();
	

	public Router(String mAC_address, String iP_address, int speed, String company, String name) {
		//super();
		this.MAC_address = mAC_address;
		this.IP_address = iP_address;
		this.speed = speed;
		this.company = company;
		this.name = name;
	}

	public void addIN(Router r) {
		connectionsIN.add(r);
	}
	
	public void addOUT(Router r) {
		connectionsOUT.add(r);
	}

	public Vector<Router> getConnectionsIN() {
		return connectionsIN;
	}

	public Vector<Router> getConnectionsOUT() {
		return connectionsOUT;
	}

	public String getMAC_address() {
		return MAC_address;
	}

	public void setMAC_address(String mAC_address) {
		MAC_address = mAC_address;
	}

	public String getIP_address() {
		return IP_address;
	}

	public void setIP_address(String iP_address) {
		IP_address = iP_address;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setConnectionsIN(Vector<Router> connectionsIN) {
		this.connectionsIN = connectionsIN;
	}

	public void setConnectionsOUT(Vector<Router> connectionsOUT) {
		this.connectionsOUT = connectionsOUT;
	}	
	
}
