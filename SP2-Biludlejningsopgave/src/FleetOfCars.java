import java.util.ArrayList;
import java.util.List;

public class FleetOfCars {
    List<Car> Cars;

    FleetOfCars() {
    Cars = new ArrayList<>();
    }

    void addCar(Car c){
        Cars.add(c);
    }
    @Override
    public String toString()
    {
        return Cars.toString();
    }

    int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for(Car c: Cars){
            sum += c.getRegistrationFee();
        }
        return sum;
    }
}

