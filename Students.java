public class Students {

   private String name;
   private int rollNumber;


Students(String n,int r){
    this.name=n;
    this.rollNumber=r;
}


    public  void displayInfo(){

        System.out.println("Student Name is :" + name);
        System.out.println("Roll No is :" + rollNumber);

        System.out.println("-----------------------------");
    }
    
}
