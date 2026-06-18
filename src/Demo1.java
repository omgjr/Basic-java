public class Demo1 {
    void show(){
        System.out.println("Show method");
    }

    void display(){
        this.show();
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.show();
        d.display(); 
    }
    
}
