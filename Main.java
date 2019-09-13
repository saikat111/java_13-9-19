
class Student{
    int roll;
    String name;
    Student(int roll,String name){
    this.name=name;
    this.roll=roll;
    }
        

    
    void print(){
System.out.println("The name is " + name);
System.out.println("The roll is " + roll);
}
    
}

 class Main {
    public static void main(String args[]){

        Student st  = new Student(13,"Saikat");
        
       st.print();
     
    }
    }
    

