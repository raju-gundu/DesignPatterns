package Adapter.Adapter;

import Adapter.Adaptee.WeightMachineImplLbs;
import Adapter.Adaptee.WeightMachinelbs;

public class WeightMachineImplKg implements WeightMachineKg {
    WeightMachinelbs weightMachinelbs;
    public WeightMachineImplKg(WeightMachinelbs weightMachinelbs){
        this.weightMachinelbs=weightMachinelbs;
    }
    public double getWeightInKg() {
        double weightInPound = weightMachinelbs.getWeightInPound();
        double weightInKg = weightInPound*0.45;
        return weightInKg;
    }
}
