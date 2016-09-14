public class NewTriangle
{
	public static double s1,s2,s3;
	public NewTriangle() throws IllegalTriangleException
	{
		this(1,1,1);
	}
	public NewTriangle(double side1, double side2, double side3) throws IllegalTriangleException
	{	
		if(side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
		{
			throw new IllegalTriangleException(side1, side2, side3);
		}
		else
		{
			s1 = side1;
			s2 = side2; 
			s3 = side3;
		}
	}
}