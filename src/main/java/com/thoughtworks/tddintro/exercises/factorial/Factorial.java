package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException {
        int fact = 1;
        if(i < 0){
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        } else {
            for(int k = 1; k <= i; k++){
                fact *= k;
            }
        }
        return fact;
    }
}
