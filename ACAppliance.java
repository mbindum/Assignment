public class ACAppliance{
String thermoStat;
int fanSpeed=5;
int acMode="AC";

public ACAppliance(){

}

public void setThermoStatMode(String mode){

	if(mode.matches("ON"|"OFF"){
		thermoStat=mode;
	}else{
		System.out.println("thermostat should be either on or Off");
	}
	
}

public void getACStatus(){

	if(thermostat.equalsIgnoreCase("OFF"){
		System.out.println("Air Conditioner is Off");
	}else{
		System.out.println("Air Conditioner is On");
		System.out.println("Air Conditioner Fan Speed-->"+fanSpeed);
		System.out.println("Air Conditioner Fan Speed-->"+acMode);

	}	
	
}
}