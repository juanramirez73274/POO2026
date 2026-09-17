public class Thermometer{
   public static final int minTemp = -50;
   public static final int maxTemp = 100;

   private int temperature;

   public boolean isValidTemperature(int temperature){
    return temperature >= minTemp && temperature <= maxTemp;
   }
   public boolean setTemperature(int newtemperature){
    if(isValidTemperature(newtemperature)){
        this.temperature = newtemperature;
        return true;
    }
    return false;
    }
    public int getTemperature() {
        return temperature;
    }
   }
  

   

   
 


