public class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity,int maxRange){
        super(registrationNumber,make,model,numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
    }

    int getBatteryCapacityKWh(){
        return batteryCapacity;
    }; // returns the battery capacity in kilowatt hours

    int getMaxRangeKm(){
        return maxRange;
    }; // returns the maximum range in kilometres.

    int getWhPrKm(){
        return batteryCapacity/maxRange;
    };

    public int getRegistrationFee() {
        int sum = 0;
        if((getWhPrKm()/91.25/100)<=50&&(getWhPrKm()/91.25/100)>20){
            sum = 330;
        }if((getWhPrKm()/91.25/100)<=20&&(getWhPrKm()/91.25/100)>15){
            sum = 1050;
        }if((getWhPrKm()/91.25/100)<=15&&(getWhPrKm()/91.25/100)>10){
            sum = 2340;
        }if((getWhPrKm()/91.25/100)<=10&&(getWhPrKm()/91.25/100)>5){
            sum = 5500;
        }if((getWhPrKm()/91.25/100)<=5){
            sum = 10470;
        }
        return sum;
    }
    // returns the power consumption in watt hours per driven kilometre.

    public String toString()
    {
        return super.toString()+" "+getWhPrKm()+" Wh/km \n";
    }
}

