public class DieselCar extends AFuelCar {
    boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
        this.particleFilter=particleFilter;
    }

    public String getFuelType() {
        return "Diesel";
    }

    public int getRegistrationFee() {
        int sum = 0;

        if(kmPrLitre()<=50&&kmPrLitre()>20){
            sum = 330+130;
        }if(kmPrLitre()<=20&&kmPrLitre()>15){
            sum = 1050+1390;
        }if(kmPrLitre()<=15&&kmPrLitre()>10){
            sum = 2340+1850;
        }if(kmPrLitre()<=10&&kmPrLitre()>5){
            sum = 5500+2770;
        }if(kmPrLitre()<=5){
            sum = 10470+15260;
        }if(hasParticleFilter()==false){
            sum += 1000;}
        return sum;
    }
    boolean hasParticleFilter(){
    return particleFilter;
    }

    public String toString()
    {
        return super.toString()+", Has particlefilter: "+hasParticleFilter()+"\n";
    }
}
