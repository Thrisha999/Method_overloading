//METHOD OVERLOADING//
import java.util.*;

class Area
{
    int area(int a)
    {
        return a*a;
    }
    double area(double b,double c)
    {
        return b*c;
    }
    double area(double r)
    {
        float e=3.14f;
        return e*r*r;
    }
}

public class Method_Overloading
{
    public static void main(String args[])
    {
        int s;
        double l,b,i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of square:");
        s = in.nextInt();
        System.out.print("Enter length and breadth of rectangle:");
        l = in.nextDouble();
        b = in.nextDouble();
        System.out.print("Enter radius of circle:");
        i = in.nextDouble();
        Area a = new Area();
        System.out.println("Area of square = "+a.area(s));
        System.out.println("Area of rectangle = "+a.area(l,b));
        System.out.println("Area of circle = "+a.area(i));
    }
}
