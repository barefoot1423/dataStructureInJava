package com.hyunwoocho.beginningJavaDS.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExponentialComplexity {

    public static void main(String[] args) {
        List<Long> primeFactors = primeFactors(new Long(2100078577));
        System.out.println("xx");
        primeFactors.forEach(System.out::println);
        System.out.println(Arrays.toString(primeFactors.toArray()));
    }

    public static List<Long> primeFactors(Long x) {
        ArrayList<Long> result = new ArrayList<>();
        long factor = 2;
        while (x > 1) {
            if (x % factor == 0) {
                x /= factor;
            } else {
                factor += 1;
            }
        }

        return result;

    }

}
