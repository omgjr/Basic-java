package in.kgcoding.challenge89;

public class VarArgs {
     public static void main(String[] args){
            System.out.println(concatenate("Prashant"));
            System.out.println(concatenate("prashant","jain"));
            System.out.println(concatenate("Subscribe","to","KG","Coding"));
        }
    public static String concatenate(String...strs){
        StringBuilder sb=new StringBuilder();
        for(String str:strs) {
            sb.append(str).append(" ");
            
        }
        return sb.toString();


       

    }
    
}
