class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        String y = String.valueOf(numberToCheck);
        while(numberToCheck > 0){
            int rem = numberToCheck% 10;
            sum += Math.pow(rem,y.length());
            numberToCheck = numberToCheck/10;
        }
    return sum == Integer.parseInt(y);
    }

}
