package com.alirnp.melicode;

import java.util.Random;

public class Utils {

    private static boolean validateCode(String input) {

        int len = input.length();
        int sum = 0;
        int securityCode;

        try {
            Long.parseLong(input);
            if (len == 10) {

                for (int i = 0; i < len - 1; i++) {
                    int number = Integer.parseInt(input.substring(i, (i + 1)));
                    sum += number * (len - i);
                }

                int left = sum % 11;
                if (left < 2)
                    securityCode = left;
                else
                    securityCode = 11 - left;

                int last = Integer.parseInt(input.substring(len - 1));

                return securityCode == last;
            }

        } catch (NumberFormatException e) {
            return false;
        }

        return false;
    }

    private static int generateCode() {
        int code;
        int max = 999999999;
        int min = 111111111;

        Random r = new Random();
        code = r.nextInt((max - min) + 1) + min;

        int index = 2;
        int x , k;
        int sum = 0 ;

        k = code ;
        while (k > 0) {
            x = k % 10;
            k = k / 10;
            sum += x * index;
            index++;
        }

        int securityCode;
        int left = sum % 11;

        if (left < 2)
            securityCode = left;
        else
            securityCode = 11 - left;

        String finalCode = String.valueOf(code) + securityCode;

        return Integer.parseInt(finalCode);
    }
}
