import ava.time.LocalDateTime;

public class SmartHome{

public static void main(String arg[]){

//Fan Appliance
    this.setFan();
//Swithch off Light
    this.setLight();

//AirConditioner

this.setAc();

this.updateSystemEveryYear();

}
private void setFan(){
    FanAppliance fanAppliance=new FanAppliance();
//switch off the fan
    fanAppliance.setFanSpeed(0);
    fanAppliance.displayFanStatus();

    //setting different speeds
    fanAppliance.setFanSpeed(1);
    fanAppliance.displayFanStatus();

    fanAppliance.setFanSpeed(2);
    fanAppliance.displayFanStatus();

    fanAppliance.setFanSpeed(3);
    fanAppliance.displayFanStatus();
}
private void setLight(){
    LightAppliance lightAppliance=new LightAppliance();
    //switch the light off
    lightAppliance.toggleLightSwitch("off");
    lightAppliance.displayLightStatus();
}

private void setAC(){

ACAppliance acApplaince=new ACAppliance();
acApplaince.thermoStat("OFF");
acApplaince.getACStatus()

acApplaince.thermoStat("ON");
acApplaince.getACStatus()


}

private void updateSystemEveryYear(){
LocalDateTime now=new LocalDateTime.now();
DateTimeFormatter dtf=new DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");

if(dtf.format(now)!=null && dtf.format(now).equlasIgnoreCase("01/01 01:00:00"){
  lightAppliance.toggleLightSwitch("off");
  acApplaince.thermoStat("OFF");
    fanAppliance.setFanSpeed(0);

}else{
	acApplaince.getACStatus();
	lightAppliance.displayLightStatus();
	fanAppliance.displayFanStatus();
}


}
}