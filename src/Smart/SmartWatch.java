package Smart;

public class SmartWatch extends SmartDevice {
	
	
	int correas = 2;
	boolean lector = true;
	String material = "Plastico";
     
	public SmartWatch() {
		
	}

	public SmartWatch(int memoriaRam, int hdd, String procesador, String marca, double peso, boolean wifi,
			boolean bluetho, String serie, int correas, boolean lector, String material) {
		super(memoriaRam, hdd, procesador, marca, peso, wifi, bluetho, serie);
		
		this.correas =correas;
		this.lector = lector;
		this.material=material;

	}

	@Override
	public String toString() {
		return "SmartWatch [correas=" + correas + ", lector=" + lector + ", material=" + material + "]";
	}
	
	
	

}
