abstract class AFuelCar extends ACar {
    int kmPrLitre;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType(); // should return “Gasoline” or “Diesel”
    int kmPrLitre(){
        return kmPrLitre;
    }; // should return how many kilometres the car can drive on 1 litre of fuel

    @Override
    public String toString()
    {
        return super.toString() + " " + kmPrLitre() + " km/l";
    }
}
