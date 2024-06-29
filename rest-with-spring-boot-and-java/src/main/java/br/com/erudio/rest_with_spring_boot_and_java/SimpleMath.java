package br.com.erudio.rest_with_spring_boot_and_java;

public class SimpleMath {

    public static Double sum (Double n1, Double n2){
        return n1 + n2;
    }

    public static Double subtract (Double n1, Double n2){
        return n1 - n2;
    }

    public static Double multiplication(Double n1, Double n2){
        return n1 * n2;
    }

    public static Double div (Double n1, Double n2){
        return n1 / n2;
    }

    public static Double avarage (Double n1, Double n2){
        return (n1 * n2) / 2;
    }

    public static Double square (Double number){
        return  Math.sqrt(number);
    }
}
