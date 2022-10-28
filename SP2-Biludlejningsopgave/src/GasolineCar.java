public class GasolineCar extends AFuelCar{

    GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
    }

    public String getFuelType(){
        return "Gasoline";
    }
    public int getRegistrationFee(){
        int sum = 0;
        if(kmPrLitre()<=50&&kmPrLitre()>20){
            sum = 330;
        }if(kmPrLitre()<=20&&kmPrLitre()>15){
            sum = 1050;
        }if(kmPrLitre()<=15&&kmPrLitre()>10){
            sum = 2340;
        }if(kmPrLitre()<=10&&kmPrLitre()>5){
            sum = 5500;
        }if(kmPrLitre()<=5){
            sum = 10470;
        }
        return sum;
    }

    public String toString()
    {
        return super.toString()+" \n";
    }
}

