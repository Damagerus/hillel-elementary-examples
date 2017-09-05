package oop.abstraction;

/**
 * Created by MBCNEWMAIN on 11.03.2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        Auto auto = new Lada(1998);
        System.out.println(auto);

        repair((Repairable) auto);


    }

    public static void repair(Repairable toRepair) {
        toRepair.repair();
    }
}
