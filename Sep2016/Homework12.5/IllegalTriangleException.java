public class IllegalTriangleException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1541487201668000294L;

	public IllegalTriangleException(double side1, double side2, double side3)
	{
		super("The sides " + side1 + ", " + side2 + ", " + side3 + " do not form a triangle");
	}
}