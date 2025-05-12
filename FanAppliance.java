public class FanAppliance{
public int speedOfFan;

public FanAppliance(){

}

public void setFanSpeed(int fanSpeed){

	if(fanSpeed>2){
		System.out.println("invalid speed");
		//exception can also be thrown if we are using exception handling
	}
	if (fanSpeed>=0 && fanSpeed<=2){
		speedOfFan=fanSpeed;
	}else {
		System.out.println("fan is off");
	}
}

private void getFanStatus(){
	if(speedOfFan==0){
		System.out.println("Fan is Switched off");
	}else{
		System.out.println("Fan is on and running at speed of "+speedOfFan);
	}
}
}