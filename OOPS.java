class Pen{
   // String color;
    //String type; //ballpoint; gel

    //public void write(){
      //  System.out.println("Writing something");
    //}

    //public void printColor(){
      //  System.out.println(this.Color);
    //}
}
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
        
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}

public class OOPS{
    public static void main(String args[]){
       Student S1 = new Student();
       S1.name = "Ahmad";
       S1.age = 24;
       
       S1.printInfo(S1.name, S1.age);

    }
}