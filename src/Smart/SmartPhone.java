package Smart;
public class SmartPhone extends SmartDevice{
	
	int botones = 3;
	 String camaraFrontal = "4MP", camaraTrasera = "8MP"; 
	  int cantidaVocinas = 1;
	   String pantalla = "LED";
	    int jackAudifono = 1;
	   
	   
	  public SmartPhone(){
		  
	  }
	

	public SmartPhone(int memoriaRam, int hdd, String procesador, String marca, double peso, boolean wifi,
			boolean bluetho, String serie) {
		this.memoriaRam = memoriaRam;
		this.hdd=hdd;
		this.procesador =procesador;
		this.marca = marca;
		this.peso =  peso;
		this.wifi=wifi;
		this.bluetho=bluetho;
		this.serie=serie;
		
	}
	
	





	@Override
	public String toString() {
		return "SmartPhone [botones=" + botones + " \n camaraFrontal=" + camaraFrontal + ", camaraTrasera="
				+ camaraTrasera + ", cantidaVocinas=" + cantidaVocinas + ", pantalla=" + pantalla + ", jackAudifono="
				+ jackAudifono + ", memoriaRam=" + memoriaRam + ", hdd=" + hdd + ", procesador=" + procesador
				+ ", marca=" + marca + ", peso=" + peso + ", wifi=" + wifi + ", bluetho=" + bluetho + ", serie=" + serie
				+ ", usuario=" + usuario + "]";
	}
	
	

}
