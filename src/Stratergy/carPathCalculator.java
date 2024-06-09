package Stratergy;

public class carPathCalculator implements PathCalculator{
    @Override
    public void findPath(String src, String dest) {
        System.out.println("Finding best car path from "+ src+ " to "+dest);
    }
}
