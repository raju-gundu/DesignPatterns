package Stratergy;

public class modeFactory {
    public static PathCalculator getMode(String mode){
        if (mode.equals("Walk")){
            return new walkPathCalculator();
        }
        else if (mode.equals("Bike")) {
            return new bikePathCalculator();
        }
        else if (mode.equals("Car")){
            return new carPathCalculator();
        }
        else {
            throw new RuntimeException("Please provide valid mode");
        }
    }
}
