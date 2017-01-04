package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        int fact = 1;
        for(int k = 1; k <= i; k++){
            fact *= k;
        }
        return fact;
    }
}
