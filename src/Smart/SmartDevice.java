package Smart;

public class SmartDevice {
	int memoriaRam = 8;
	 int hdd = 800;
	  String procesador = "intel";
	   String marca = "SAMSUNG";
	    double peso = 156.87;
	   boolean wifi = true;
	  boolean bluetho = true;
	  String serie = "tr56bv89";
	 String usuario;
	  
	 
	 public SmartDevice(){
		 
	 }

	public SmartDevice(int memoriaRam, int hdd, String procesador, String marca, double peso, boolean wifi,
			boolean bluetho, String serie) {
		
	}
	
	
	public void Saludar(String usuario){
		System.out.println("Hola " + usuario);
		this.usuario = usuario ;
	}


	
	public String toString() {
		return "SmartDevice [memoriaRam =" + memoriaRam + ", hdd =" + hdd + ", procesador =" + procesador + ", marca ="
				+ marca + ", peso =" + peso + ", wifi =" + wifi + ", bluetho =" + bluetho + ", serie =" + serie + ", name ="
				+ usuario + "]";
	}
	 

}
