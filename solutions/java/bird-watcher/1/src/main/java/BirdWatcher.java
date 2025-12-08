
class BirdWatcher {
    private final int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
        
    }

    public boolean hasDayWithoutBirds() {
        for(int v : birdsPerDay){
            if(v == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int c = 0;
        if (numberOfDays > birdsPerDay.length)
            numberOfDays = birdsPerDay.length;
        for(int i=0;i<numberOfDays;i++)
            c += birdsPerDay[i];
        return c;
    }

    public int getBusyDays() {
        int c = 0;
        for (int v : birdsPerDay){
            if(v >= 5)
                c += 1;
        }
        return c;
    }
}
