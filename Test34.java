//Static method


class Student
{
   int rollno;
   String name;
   static String collegename="ADCET";
   static void data()
   {
     collegename="KIT";
   }
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
public class Test34
{
    public static void main(String[] args)
    {
       Student.data();
       Student s=new Student(12,"Karan");
       Student s1=new Student(13,"Jerry");
       
       s.display();
       s1.display();
   }
}
   