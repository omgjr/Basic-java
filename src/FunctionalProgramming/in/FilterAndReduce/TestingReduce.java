package FunctionalProgramming.in.FilterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,3,4,2,5,6,3);

        int sum=0;
        for (Integer number : numbers) {
            sum+=number;
            
        }
        System.out.println(sum);

       int newSum= numbers.stream()
        .reduce(0, new BinaryOperator<Integer>(){
            @Override
            public Integer apply(Integer integer1, Integer integer2) {
               return integer1+integer2;
            }
            
        });
        System.out.println("Sum using reduce: "+newSum);


        int newSum2=numbers.stream()
        .reduce(0,(a,b)->a+b);
        System.out.println(newSum2);
    }

    
    
}
