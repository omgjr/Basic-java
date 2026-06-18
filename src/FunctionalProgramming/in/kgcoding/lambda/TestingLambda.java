package FunctionalProgramming.in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
       TestingLambda test=new TestingLambda();
       int sum=test.sum(6, 7);
       System.out.println(sum);
      test.printString("this is best course");
        }

    public void printString(String toPrint){
        System.out.println(toPrint);
    }

    public int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
}
