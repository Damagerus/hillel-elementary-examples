package oop.polymorphism.shop.department;

import oop.polymorphism.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicTestingTable {
    private ElectronicDeviceInterface eDevice;
    private boolean property = true;

    public ElectronicTestingTable(ElectronicDeviceInterface eDevice) {
        this.eDevice = eDevice;
    }

    public boolean check() {
        return (      eDevice.on() && !eDevice.off()    );
    }
}
