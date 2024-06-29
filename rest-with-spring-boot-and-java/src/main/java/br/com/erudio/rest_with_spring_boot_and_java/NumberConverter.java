package br.com.erudio.rest_with_spring_boot_and_java;

public class NumberConverter {


    public static Double convertToDouble(String strNumber) {
        if(strNumber == null){
            return 0D;
        }else {
            String number = strNumber.replaceAll(",", ".");
            if(isNumeric(number)){
                return Double.parseDouble(number);
            }
            return Double.valueOf(number);
        }
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber  == null){
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[+-]?([0-9]*[.])?[0-9]+");
    }
}
