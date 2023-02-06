package Test1;

import java.util.Scanner;

public class T_Shirt {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] cart = {"round-neck", "collared", "hooded","round-neck", "round-neck"};
		int totalCost = 0;
		int discount = 0;
		int finalAmount = 0;
		
		for (String type : cart) 
		{
			  if (type.equals("round-neck")) 
			  {
			    totalCost=totalCost+200;
			  }
			  else if (type.equals("collared")) 
			  {
			    totalCost = totalCost+250;
			  } 
			  else if (type.equals("hooded"))
			  {
			    totalCost =totalCost+300;
			  }
			}

			if (cart.length < 5) 
			{
			  discount =totalCost*( 0/100);
			}
			else if (cart.length >= 5 && cart.length <= 10)
			{
			  discount = totalCost*(10/100);
			} 
			else if (cart.length > 10)
			{
			  discount = totalCost*(20/100);
			}

			finalAmount = totalCost - (totalCost * (discount / 100));
			System.out.println("Final Price is: Rs." + finalAmount);
		
	}

}


