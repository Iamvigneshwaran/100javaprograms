package training;
import java.util.Scanner;
public class Areaoftriangle {
	Scanner s=new Scanner(System.in);
	
	public double area(){
		
	 System.out.println("Enter the width of the Triangle:");
     double b= s.nextDouble();

     System.out.println("Enter the height of the Triangle:");
      double h= s.nextDouble();
      
      return (b*h)/2;
	}

}
