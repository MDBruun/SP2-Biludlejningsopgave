abstract class ACar implements Car {

    String registrationNumber;
    String make;
    String model;
    final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.numberOfDoors= numberOfDoors;
        this.registrationNumber=registrationNumber;
        this.make=make;
        this.model=model;
    }

    public  String getRegistrationNumber(){
        return registrationNumber;
    }; //The number on the number plate

    public String getMake(){
        return make;
    }; // The make of the car e.g. Audi

    public String getModel(){
        return model;
    }; // The model of the car e.g. A6

    public int getNumberOfDoors(){
        return numberOfDoors;
    }; // The number of doors

    @Override
    public String toString(){
        return "Nummerplade: " + getRegistrationNumber()+", Mærke: "+getMake()+", Model: "+getModel()+", Dører: "+getNumberOfDoors()+".";
    }
}
