package com.hyunwoocho.beginningJavaDS.ch1;

public class ConvertToDecimal {

    public int convertToDecimal(String binary) {

        int conversion = 1;
        int ret = 0;

        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1') {
                ret += conversion;
            }
            conversion *= 2;

        }

        System.out.println(ret);

        return ret;
    }

}
