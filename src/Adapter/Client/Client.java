package Adapter.Client;

import Adapter.Adaptee.WeightMachineImplLbs;
import Adapter.Adapter.WeightMachineImplKg;
import Adapter.Adapter.WeightMachineKg;

public class Client {
    public static void main(String[] args) {
        WeightMachineKg weightMachineKg = new WeightMachineImplKg(new WeightMachineImplLbs());
        System.out.println(weightMachineKg.getWeightInKg());
    }
}
