package Stratergy;

public class googleMaps {
    public void findPath(String src,String dest,String mode){
        PathCalculator pathCalculator = modeFactory.getMode(mode);
        pathCalculator.findPath(src,dest);
    }
}
