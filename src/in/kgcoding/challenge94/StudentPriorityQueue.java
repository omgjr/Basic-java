package in.kgcoding.challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

 class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue=new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare( student, t1) {
                return student.getGrade()-t1.getGrade();
            }
            
        });
        queue.offer(new Student("Prashant",'B'));
        queue.offer(new Student("Shyam",'c'));
        queue.offer(new Student("Ram",'A'));
        queue.offer(new Student("Mohan",'D'));
        queue.offer(new Student("Sanchit",'A'));

        System.out.println("Queue is: %s",queue);
    }
    


    private final String name;
    private final char grade;

    public Student(String name,char grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public char getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return name+":"+ grade;
    }
}
    

