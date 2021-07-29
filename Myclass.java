public class Myclass
{
   int age;
   String name;
   Myclass()
   {
      this("BeginnersBook.com");
   }
   Myclass(String s)
   {
     this(s,6);
   }
  Myclass(String s,int age)
  {
     this.name=s;
     this.age=age;
  }
 public void display()
 {
    System.out.println("name" +name+ " " + "age" +age);
  }
 public static void main(String[] args)
 {
    Myclass obj=new Myclass();
    obj.display();
 }
}