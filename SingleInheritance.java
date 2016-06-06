import java.io.*;

public class SingleInheritance extends CalculateArea {

	public static void main(String[] args) throws IOException {
		
		SingleInheritance si = new SingleInheritance();
			
		//Dimensions of Rectangle
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the Rectangle : ");
		int rectLength = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the breadth of the Rectangle : ");
		int rectBreadth = Integer.parseInt(br.readLine());

		//Calculate Area of Rectangle
		double rectArea = si.calculateRectArea(rectLength,rectBreadth);

		//Dimensions of Triangle
		System.out.print("Enter the base of the Triangle : ");
		int triBase = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the height of the Triangle : ");
		int triHeight = Integer.parseInt(br.readLine());

		//Calculate Area of Triangle
		double triArea = si.calculateTriArea(triHeight,triBase);

		//Print Area of Rectangle
		System.out.println("Area of Rectangle : " + rectArea);
	
		//Print Area of Triangle
		System.out.println("Area of Triangle : " +triArea);
		
	}

}
