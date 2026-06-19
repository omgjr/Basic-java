package in.kgcoding.MethodReferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,3,4,2,5,6,3);



        numbers.stream()
        .filter(num->num%2==1)
        .forEach(System.out::println);


         numbers.stream()
        .filter(num->num%2==1)
        .forEach(num->System.out.println(num));
    }
    
}
