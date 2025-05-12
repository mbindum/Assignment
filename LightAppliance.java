publc class LightAppliance{
public String toggleLight;
public LightAppliance(){
}
public void toggleLightSwitch(String status){
toggleLight=status;
}

public void displayLightStatus(){
if(toggleLight.equalIgnoreCase("off"))
	System.out.println("light is switched off");
}else{
	System.out.println("light is switched on");

}

}