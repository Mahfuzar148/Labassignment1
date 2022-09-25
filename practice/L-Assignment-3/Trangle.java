public class Trangle {
    int x1,x2,x3,y1,y2,y3;

    public Trangle(int x1,int x2,int x3,int y1,int y2,int y3) {
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
}
