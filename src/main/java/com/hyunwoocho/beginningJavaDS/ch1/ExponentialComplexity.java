package com.hyunwoocho.beginningJavaDS.ch1;

import java.util.ArrayList;
import java.util.List;

public class ExponentialComplexity {

    public static void main(String[] args) {
        List<Long> primeFactors = primeFactors(new Long(210078577));
        System.out.println("xx");
        primeFactors.forEach(System.out::println);
    }

    public static List<Long> primeFactors(Long x) {
        ArrayList<Long> result = new ArrayList<>();
        long factor = 2;
        while (x > 1) {
//            System.out.println(factor);
            if (x % factor == 0) {
                x /= factor;
            } else {
                factor += 1;
            }
        }

        return result;

    }

}
