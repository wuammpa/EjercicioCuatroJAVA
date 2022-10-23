package Smart;
public class SmartMain {
	
	public static void main(String[] args) {
		
		SmartDevice dispositivo1 = new SmartDevice();
		SmartPhone  dispositivo2 = new SmartPhone();
		SmartWatch dispositivo3 = new SmartWatch();
		
		dispositivo1.Saludar("juan");
		 System.out.println(dispositivo1);
		 
		 dispositivo2.Saludar("jose");
		 System.out.println(dispositivo2);
		 
		 dispositivo3.Saludar("Gounter");
		 System.out.println(dispositivo3);
		 
		 
		 SmartDevice dispositivo4 = new SmartPhone();
			SmartDevice  dispositivo5 = new SmartPhone(2, 100, "AmD", "Huawei", 145.89, false, true, "jau656j");
		 
		 
		 
		dispositivo5.Saludar("yaka");
		
		System.out.println(dispositivo5);
	}

}

