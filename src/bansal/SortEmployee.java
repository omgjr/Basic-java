package bansal;
import java.util.Set;
import java.util.TreeSet;

public class SortEmployee {
    public static void main(String[] args) {
     Employee e1=new Employee("kamal", "s103", 23) ;
     Employee e2=new Employee("brajesh","s101",22);
     Employee e3=new Employee("akhil","s102",21);  

     Set<Employee> s=new TreeSet();
     s.add(e1);
     s.add(e2);
     s.add(e3);

     System.out.println(s);
    }
    
}
