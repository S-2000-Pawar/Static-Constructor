//


enum Season
{
   Winter(4),Spring(11),Summer(15),Fall(6);
   private int value;
   private Season(int value)
   {
     this.value=value;
   }
 

  public static void main(String[] args)
  {

    
    for(Season s:Season.value())
    System.out.println(s+ " " +s.value);
  }
}