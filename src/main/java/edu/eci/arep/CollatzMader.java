package edu.eci.arep;

import java.util.ArrayList;

public class CollatzMader {

    public int number = 0;

    public ArrayList<Integer> collatzResult = new ArrayList<>();
    private boolean isOdd(int number){
        return(number % 2 == 0);
    }


    public CollatzMader(int number) {
        this.number = number;
        collatzResult.add(number);
    }

    public void makeCollatz() {

        number = number%2==0 ? number/2 : 3* number + 1;
        if (number > 1) {
            if (isOdd(number)) {
                collatzResult.add(number / 2);
            } else {
                collatzResult.add(3 * number + 1);
            }
            makeCollatz();
        }else{
            collatzResult.add(number);
        }
    }
    public ArrayList<Integer> getCollatzResult() {
        return collatzResult;
    }
}
