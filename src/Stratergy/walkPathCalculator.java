package Stratergy;

public class walkPathCalculator implements PathCalculator{
    @Override
    public void findPath(String src, String dest) {
        System.out.println("Finding best walk path from "+ src+ " to "+dest);
    }
}
