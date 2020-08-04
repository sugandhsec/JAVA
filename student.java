class student
{
  public static void main(String s[])
  {
    int m1=Integer.parseInt(s[0]);
        int m2=Integer.parseInt(s[1]);
        int m3=Integer.parseInt(s[2]);
     int total=m1+m2+m3;
    System.out.println("Total="+total);

     int per=total/3;
    System.out.println("Percentage="+per+"%"); 

     if(m1>35&&m2>35&&m3>35) 
       {
         if(per>=90)
           {
               System.out.println("Grade=A");
           }
         else if(per>=70&&per<90)
          {
               System.out.println("Grade=B");
           }
          else if(per>=50&&per<70)
          {
               System.out.println("Grade=C");
           }
           else if(per>=35&&per<50)
          {
               System.out.println("Grade=D");
           }
        }
      else
      {
         System.out.println("Student is fail so grade is not calculated"); 
       }
   }
  }
