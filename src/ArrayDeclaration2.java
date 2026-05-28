public class ArrayDeclaration2 {
    public static void main(String[] args){
        int[] marks=new int[5];

        marks[0]=98;
        marks[1]=97;
        marks[2]=99;
        marks[3]=100;
        marks[4]=98;
       // marks[5]=89;

       for(int i=0; i<marks.length; i++){

        System.out.println(marks[i]+"  ");
       }
    }
    
}
