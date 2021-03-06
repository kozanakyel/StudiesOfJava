
package testexceptionjava;

public class CircleWithCustomException {
   private double radius;
   private static int numberOfObjects = 0;
   
   public CircleWithCustomException() throws InvalidRadiusException{
       this(1.0);
   }
   
   public CircleWithCustomException(double radius)
       throws InvalidRadiusException{
       setRadius(radius);
       numberOfObjects++;
   }
   
   public double getRadius(){
       return radius;
   }
   
   public static int getNumberOfObjects(){
       return numberOfObjects;
   }
   
   public void setRadius(double newRadius)
        throws InvalidRadiusException{
       if(newRadius >= 0)
           radius = newRadius;
       else
           throw new InvalidRadiusException(newRadius);
   }
   
   public double findArea(){
       return radius * radius * 3.14159;
   } 
}
