package CollectionAndGenerics.collection;
import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>();
        strList.add("Prashant");
        strList.add("jain");
       // strList.add(54);

        strList.add(1,"Pradeep");
        strList.remove(0);

        if(strList.contains("jain")){
            System.out.println(strList.indexOf("jain"));
        }

        for(int i=0;i<strList.size();i++){
           System.out.println(strList.get(i));
        }

       // System.out.println(strList.get(0));

       for(String str:strList){
        System.out.println(str);
       }

    }
    
}
