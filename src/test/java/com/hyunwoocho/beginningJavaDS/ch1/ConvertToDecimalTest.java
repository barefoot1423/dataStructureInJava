package com.hyunwoocho.beginningJavaDS.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToDecimalTest {


    @Test
    void name() {
        ConvertToDecimal convertToDecimal = new ConvertToDecimal();
        assertEquals(22, convertToDecimal.convertToDecimal("10110"));
    }

}
