public class Main {
    public static void main(String[] args) {
        FleetOfCars listOne = new FleetOfCars();

        DieselCar d1 = new DieselCar("DN87477","Alfa Romeo","Giulia",5,30,true);
        DieselCar d2 = new DieselCar("FE17399","Toyota","Corolla",5,10,false);
        GasolineCar g1 = new GasolineCar("GH89644","Mazda","CX-5",5,25);
        GasolineCar g2 = new GasolineCar("KL89302","Mercedes-Benz","E-klasse",5,12);
        ElectricCar e1 = new ElectricCar("EW38742","BMW","iX",5,10000,200);

        listOne.addCar(d1);
        listOne.addCar(d2);
        listOne.addCar(g1);
        listOne.addCar(g2);
        listOne.addCar(e1);

        System.out.println(listOne.toString());

        System.out.println("Total: "+listOne.getTotalRegistrationFeeForFleet());
    }
}