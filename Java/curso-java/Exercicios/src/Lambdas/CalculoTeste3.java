package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        
        BinaryOperator<Double> calculo = (x,y) -> {return x+y;};

        System.out.println(calculo.apply(6.0, 3.0));

        calculo = (x,y) -> x*y;
        System.out.println(calculo.apply(3.0, 3.0));


        BinaryOperator<Integer> calculo2 = (x,y) -> {return x+y;};

        System.out.println(calculo2.apply(6, 3));

        calculo = (x,y) -> x*y;
        System.out.println(calculo2.apply(3, 3));

    }
}
