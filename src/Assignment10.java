public class Assignment10 {
int a=10;
public void display(){
    int a=50;
    System.out.println("Local variable is: "+a);
    System.out.println("Instence variable is: "+this.a);
}
public static void main(String[] args) {
 Assignment10 obj=new Assignment10();
 obj.display();   
}
    
}
