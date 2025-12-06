public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int work = speed * 221;
        double production;
        if( speed >=1 && speed <=4){
            production = work;
        }
        else if(speed >= 5 && speed <= 8){
            production = work - (work * 0.1);
        }
        else if(speed == 9){
            production = work - (work * 0.2);
        }
        else{
            production = work - (work * 0.23);
        }
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        int production = (int)(productionRatePerHour(speed))/60;
        return production;
        
    }
}
