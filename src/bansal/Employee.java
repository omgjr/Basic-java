package bansal;

public class Employee implements Comparable<Employee> {
    String name;
    String id;
    int age;

    @Override
    public String toString() {
        return name+" "+id+" "+age;
    }

   

    public Employee(String name,String id,int age){
        super();
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public int compareTo(Employee e1){
       // Employee e1=(Employee)o;
        if(this.age>e1.age){
            return 1;
        }else if (this.age<e1.age) {
            return -1;
            
        }else{
            return 0;
        }
    }
    
}
