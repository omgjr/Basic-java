package in.kgcoding.challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs =List.of("Prashant jain","bad","is teaching java","ghatiya","ganda","on kg coding","Best youtube programming challenge");
      String result= strs.stream()
       .filter(str -> str.length()>10)
       .reduce("",(a,b) -> a+" "+b);

       System.out.println(result);
    }
    
}
