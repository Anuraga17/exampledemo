import java.util.*;
package Question3;
public abstract class Shape
{
     abstract double area();
}
class Circle extends Shape
{
       private double radius;
       Circle(double radius)
       {
           this.radius=radius;
       }
       //provide parameterized constructor.
      //override area() ;
      @Override double area()
      {
          return 3.14*radius*radius;
      }
}
class Rectangle extends Shape
{
     private double length,breadth;
      //provide parameterized constructor
      Rectangle(double length,double breadth)
      {
          this.length=length;
          this.breadth=breadth;
      }
     // override area() ;
     @Override double area()
     {
         return length*breadth;
     }
     
     
}
class ShapesFactory
{
          ArrayList<Shape> slist = new ArrayList<>(); 
         public ShapesFactory() { }
        
      public void addShape(Shape s)
       {
                slist.add(s);
        }
        public ArrayList<Circle> getCircles()
        {
              ArrayList<Shape> clist=new ArrayList<>();
              Iterator<Shape> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  Shape temp=iter.next();
                  if(temp.getClass().getName()=="Circle")
                  {
                      clist.add(temp);
                  }
                  
              }
              return clist;
              
        }
       public ArrayList<Rectangle> getRectangles()
        {
              
              ArrayList<Shape> rlist=new ArrayList<>();
              Iterator<Shape> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  Shape temp=iter.next();
                  if(temp.getClass().getName()=="Rectangle")
                  {
                      rlist.add(temp);
                  }
                  
              }
              return rlist;
        }
        public boolean deleteShape(Shape s)
        {
                  
                  if(slist.contains(s))
                  {
                     slist.remove(slist.indexOf(s)); 
                  }
                  return slist.contains(s);
        }
        
}