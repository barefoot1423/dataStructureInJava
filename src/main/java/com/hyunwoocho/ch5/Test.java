package com.hyunwoocho.ch5;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0");
        System.out.println(a.compareTo(BigDecimal.ZERO));
    }
}
