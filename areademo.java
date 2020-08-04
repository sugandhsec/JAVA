import java.io.*;
class rectangle
 {
 double area,length,breadth;
double findarea(double l,double b)
 {
  length =l;
breadth=b;
area=length*breadth;
return area;
}
 }

class areademo
 {
   public static void main(String s[]) throws IOException
    {
      rectangle ob=new rectangle();
 	double a,l,b;

DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter length");
l=Double.parseDouble(in.readLine());
System.out.println("Enter braedth");
b=Double.parseDouble(in.readLine());
a=ob.findarea(l,b);
System.out.println("area="+a);
    }
}
