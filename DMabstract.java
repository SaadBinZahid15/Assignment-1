abstract class Figure
{
	double dim1;
	double dim2;
	double dim3;
	Figure(double x,double y)
	{
		dim1=x;
		dim2=y;
	}
	abstract double area();
	/***{
		System.out.println("No area calculated");
		return 0;
	}***/
}
class Triangle extends Figure
{
	Triangle(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return 1.0/2.0*dim1*dim2;
	}
}
class Square extends Figure
{
	Square(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class DMabstract
{
	public static void main(String[] arg)
	{
		Figure ff;
		Triangle tt=new Triangle(10,20);
		Square ss=new Square(200,4);
		double aot=tt.area();
		double aos=ss.area();
		System.out.println("Triangle area="+aot);
		System.out.println("Square area="+aos);
	}
}