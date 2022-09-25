public class Triangle {
    int x1,x2,x3,y1,y2,y3;

    public Triangle(int x1,int x2,int x3,int y1,int y2,int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    double a,b,c;
    public void lengths()
    {
        a=Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        b=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        c=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    //double d = a,e = b ,f = c ;
    public double getSideLength1()
    {
        return a;
    }
    public double getSideLength2()
    {
        return b;
    }
    public double getSideLength3()
    {
      return c;
   }
   double angl1;
   public double getAngle1()
   {
       angl1 =Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
       return angl1;
   }
    double angl2;
    public double getAngle2()
    {
        angl2 = Math.toDegrees(Math.acos((c*c+a*a-b*b)/(2*c*a)));
        return angl2;
    }
    double angl3;
    public double getAngle3()
    {
        angl3 = Math.toDegrees(Math.acos((b*b+a*a-c*c)/(2*b*a)));
        return angl3;
    }
    double p;
    public double getPerimeter()
    {
        p=a+b+c;
        System.out.println("Half perimete="+p/2);
        return p;
    }
    public double getArea() {
        return Math.sqrt((p/2)*((p/2)-a)*((p/2)-b)*((p/2)-c));
    }
}
