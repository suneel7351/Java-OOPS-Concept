class Inheritence {
    public static void main(String ar[]) {
        Pajero x = new Pajero();
        Safari y = new Safari();
        Fortuner z = new Fortuner();
        x.Pajerodisplay();
        x.Cardisplay();
        y.Safaridisplay();
        y.Cardisplay();
        z.Fortunerdisplay();
        z.Cardisplay();
    }
}

class Car {
    String BodyType = "SUV";
    String FuelType = "Diesel";
    int NoOfCylinder = 4;
    boolean DriverAirbag = true;

    void Cardisplay() {
        System.out.println("Body Type =" + BodyType + "\n" + "Fuel Type = " + FuelType + "\n" + "No fo Cylinder = "
                + NoOfCylinder + "\n" + "Driver AirBag = " + DriverAirbag);
    }
}

class Pajero extends Car {
    String car = "Pajero";
    int FuelTankCapacity = 70;
    int Milage = 9;
    int EngineDisplacement = 2477;

    void Pajerodisplay() {
        System.out.println(car + " has following features: " + "\n" + "Fuel Tank Capacity = " + FuelTankCapacity + "\n"
                + " Milage = " + Milage + "\n" + "Engine Displacement (in cc) = " + EngineDisplacement);
    }
}

class Safari extends Car {
    String car = "Safari";
    int FuelTankCapacity = 50;
    int Milage = 10;
    int EngineDisplacement = 1956;

    void Safaridisplay() {
        System.out.println(car + " has following features: " + "\n" + "Fuel Tank Capacity = " + FuelTankCapacity + "\n"
                + " Milage = " + Milage + "\n" + "Engine Displacement (in cc) = " + EngineDisplacement);
    }
}

class Fortuner extends Car {
    String car = "Fortuner";
    int FuelTankCapacity = 80;
    int Milage = 8;
    int EngineDisplacement = 2755;

    void Fortunerdisplay() {
        System.out.println(car + " has following features: " + "\n" + "Fuel Tank Capacity = " + FuelTankCapacity + "\n"
                + " Milage = " + Milage + "\n" + "Engine Displacement (in cc) = " + EngineDisplacement);
    }
}