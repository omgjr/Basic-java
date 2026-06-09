package in.kgcoding.challenge85;

public class Calculator {
   public  int add(int first,int second){
       return first+second;
    }

    public int add(int first,int second,int third){
        return first+second+third;
    }

    public double add(double first,double second){
       return first+second;
   }

    public static void main(String[] args){
        Calculator obj=new Calculator();
       System.out.println( obj.add(10, 30));
       System.out.println( obj.add(40, 2,8));
    System.out.println( obj.add(5.4, 2.2));
    }
    
}
