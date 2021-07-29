// Constructor chain


class Chain
{
  Chain()
  {
      this("Javapoint");
      System.out.println("Default constructor called"); 
  }
 Chain(String str)
  {
      System.out.println("Parameterized condtructor called");
  }
public static void main(String[] args)
{
    Chain c=new Chain();
}
}