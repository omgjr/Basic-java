 class StudentToString {
    
     String name;
     String rollNumber;
     int id;
     String house;   
    
    public StudentToString(String name,String rollNumber,int id,String house){
        this.name=name;
        this.rollNumber=rollNumber;
        this.id=id;
        this.house=house;
    }
    public String ToString(){
        return "student details:{name:"+name+",rollNumber:"+rollNumber+",id:"+id+",house:"+house+"}";
    }
    public static void main(String[] args) {
      StudentToString stu=new StudentToString("Prashant","one",001,"Shivaji"); 
      System.out.println(stu); 
    }
}
    

