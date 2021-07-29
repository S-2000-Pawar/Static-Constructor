//Static variable


class Student
{
   int rollno;
   String name;
   static String collegename="ADCET";
   Student(int r,String n)
   {
     rollno=r;
     name=n;
   }
void display()
{
   System.out.println("rollno"  +rollno+ " " +   "name" +name+  " " +  "collegename" +collegename);
}
}
public class Test3
{
    public static void main(String[] args)
    {
       Student s=new Student(12,"Karan");
       Student s1=new Student(13,"Jerry");
       s.display();
       s1.display();
   }
}
   