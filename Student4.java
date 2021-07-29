//Static variable


class Student
{
   int rollno;
   String name;
   static String collegename="ADCET";
   void data()
   {
     System.out.println("rollno" +rollno+  "name" +name+  "collegename" +collegename);
   }
}
public class Student45
{
   public static void main(String[] args)
   {
      Student s=new Student(35,"Jerry");
      Student s1=new Student(34,"Karan");
      s.data();
      s1.data();
   }
}
