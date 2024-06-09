package Stratergy;

public class Client {
    public static void main(String[] args) {
        googleMaps googleMaps = new googleMaps();
        googleMaps.findPath("A","B","Bike");
        googleMaps.findPath("A","C","Wal");
    }
}
