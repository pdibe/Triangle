package Triangle;

public class Triangle {
	private static double side1;
	private static double side2;
	private static double side3;
	public static void Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public static void Triangle(double s1, double s2, double s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public static double getSide1(){
		return(side1);
	}
	public static double getSide2(){
		return(side2);
	}
	public static double getSide3(){
		return(side3);
	}
	public static double getArea(){
		double p = (side1+side2+side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return(area);
	}
	public static double getPerimeter(){
		double Per = side1+side2+side3;
		return(Per);
	}
	public String toString(){
		String s = "The triangle has sides of length "+Double.toString(side1)+", "+Double.toString(side2)+", and "+Double.toString(side3)+".";
		return(s);
	}
}
