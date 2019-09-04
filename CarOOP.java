import java.util.Scanner; 

public class CarOOP
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		Car[] c = new Car[10];
		for(int i = 0 ; i < c.length; i++)
		{
			c[i] = new Car();
		}
		
		System.out.println("Enter a number between 1 - 10 to select a car: ");
		int carNumb = scan.nextInt(); 
		System.out.println();
		
		System.out.println("Car # "+carNumb+ " Information");
		System.out.println(c[carNumb-1].toString());
		c[carNumb-1].getGrid();
		
		while(true)
		{
			System.out.println("What would you like to do?");
			System.out.println("1: Turn the ignition on/off");
			System.out.println("2: Change the position of the car");
			System.out.println("3: Change cars");
			System.out.println("Q: Quit program");
			
			String input = scan.next();
			
			if(input.equals("1"))
			{
				
				c[carNumb-1].setIgnition(c[carNumb-1].ignitionSwitch(c[carNumb-1].getIgnition()));
				System.out.println("Car # "+carNumb+ " Information");
				System.out.println(c[carNumb-1].toString());				
				c[carNumb-1].getGrid();	
			}
			else if(input.equals("2"))
			{
				System.out.println("In which direction do you want to move the car?");
				System.out.println("H: Horizontal");
				System.out.println("V: Vertical");
				
				input = scan.next();
				
				if(input.equals("H"))
				{
					System.out.println("put the distance");
					int xDistance = scan.nextInt(); 
					
					c[carNumb-1].setX(c[carNumb-1].moveHorizontal(c[carNumb-1].getIgnition() ,c[carNumb-1].getX(), xDistance));   
					System.out.println("Car # "+carNumb+ " Information");
					System.out.println(c[carNumb-1].toString());				
					c[carNumb-1].getGrid();
				}
				else if(input.equals("V"))
				{
					System.out.println("put the distance");
					int yDistance = scan.nextInt(); 
					
					c[carNumb-1].setY(c[carNumb-1].moveHorizontal(c[carNumb-1].getIgnition() ,c[carNumb-1].getY(), yDistance));  
					System.out.println("Car # "+carNumb+ " Information");
					System.out.println(c[carNumb-1].toString());				
					c[carNumb-1].getGrid();
				}
				else
				{
					System.out.println("you put the wrong input\n");
				}
			}
			else if(input.equals("3"))
			{
				System.out.println("Enter a number between 1 - 10 to select a car: ");
				carNumb = scan.nextInt(); 
				
				System.out.println("Car # "+carNumb+ " Information");
				System.out.println(c[carNumb-1].toString());				
				c[carNumb-1].getGrid();
			}
			else if(input.equals("Q"))
			{
				System.out.println("you just ended the program");
				System.exit(0);
			}
			else
			{
				System.out.println("you put the wrong input here, try again\n");
			}
		}	
	}
}

class Car
{
	private boolean ignition; 
	private char charColor;
	private int x;
	private int y;
	
	public Car(boolean ignition, char charColor, int x, int y)
	{
		this.ignition = ignition;
		this.charColor = charColor;
		this.x = x;
		this.y = y;
	}
	
	public Car() 
	{
		ignition = false;
		charColor = assignColor();
		x = randomizePosition();
		y = randomizePosition();
	} 
	public void setIgnition(boolean ignition)
	{
		this.ignition = ignition;
	}
	
	public boolean getIgnition()
	{
		return ignition;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getY()
	{
		return y;
	}
	
	public char assignColor()
	{
		String colorString = "RGBWS";
		int tmp = (int)(Math.random()*5) ;
		
		char charColor = colorString.charAt(tmp);
		return charColor;
	}
	
	public int moveHorizontal(boolean ignition, int x, int xMovement)
	{
		if(ignition == false)
		{
			System.out.println();
			System.out.println("the ignition is off");
			return x;
		}
		else
		{
			if(x + xMovement < 1 || x + xMovement > 20)
			{
				System.out.println();
				System.out.println("out of boundary\n");
				return x;
			}
			else
			{
				return x + xMovement;	
			}
		}
	}
	
	public int moveVertical(boolean ignition, int y, int yMovement)
	{
		if(ignition == false)
		{
			System.out.println();
			System.out.println("the ignition is off");
			return y;
		}
		else
		{
			if(y + yMovement < 1 || x + yMovement > 20)
			{
				System.out.println();
				System.out.println("out of boundary\n");
				return y;
			}
			else
			{
				return y + yMovement;	
			}
		}
	}
	
	public boolean ignitionSwitch(boolean ignition)
	{
		ignition = !ignition;
		return ignition;
	}

	public String getColor()
	{
		
		String colorString = "";
		
		if(charColor == 'R')
		{
			colorString ="RED";
		}
		else if(charColor == 'G')
		{
			colorString ="Green";
		}
		else if(charColor == 'B')
		{
			colorString ="Black";
		}
		else if(charColor == 'W')
		{
			colorString ="White";
		}
		else if(charColor == 'S')
		{
			colorString ="Silver";
		}
		
		return colorString;
	}
	
	public int randomizePosition()
	{
		return (int)(Math.random() * 20 + 1); // 1~20
	}
	
	public void getGrid()
	{
		for(int i = 1; i <= 20; i++)
		{
			for(int j = 1; j <= 20; j++)
			{
				if((j == x) &&(i == y))
				{
					System.out.print(charColor);
				}
				else
				{
					System.out.print("-");	
				}
			}
			System.out.println();
		}
	}
	
	public String toString()
	{
		String result = "";
		
		String colorString = getColor();
		String ignitionSwitch = "";
		String location = "(" + x + "," + y + ")";
		
		if(getIgnition() == true)
		{
			ignitionSwitch = "on";
		}
		else
		{
			ignitionSwitch = "off";
		}
		result = "Color: " + colorString  + "\n"+ "Ignition: " + ignitionSwitch + "\n" + "Location: " + location + "\n";
		return result;	
	}
}
