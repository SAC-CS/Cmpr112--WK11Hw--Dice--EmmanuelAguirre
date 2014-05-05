
// Emmanuel Aguirre
// Cmpr-112
// Wk11 HW
// 5/4/14
// Dice.java

public class Dice 
{
	int value;
	int myBounces;
	int myThrows;
	
	int one;
	int two;
	int three;
	int four;
	int five;
	int six;
 
	public Dice(int bounces)
	{
		value = -1;
		myBounces = bounces;
		myThrows = 0;
		
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
	}
 
	public int Throw()
	{
		int avg=0;
		for(int i = myBounces; i > 0; i--)
			avg += (1 + (int) (Math.random() * 6));
  
		avg/=myBounces;

  
		value = avg;
		
		switch (value)
		{
		case 1:
			one++;
			break;
		case 2:
			two++;
			break;
		case 3:
			three++;
			break;
		case 4:
			four++;
			break;
		case 5:
			five++;
			break;
		default:
			six++;
			break;
			
		}
		
		
		myThrows++; //keeps track of throws
		return value;
	}
 
	public static int oneThrow()
	{
		
		return (1 + (int) (Math.random() * 6));
	
	}
	
	public int numThrows()
	{
		return myThrows;
	}
	
	
	public int Value()
	{
		return value;
	}
	
	public void displayHistory()
	{
		System.out.println("1: " + one + " times.");
		System.out.println("2: " + two + " times.");
		System.out.println("3: " + three + " times.");
		System.out.println("4: " + four + " times.");
		System.out.println("5: " + five + " times.");
		System.out.println("6: " + six + " times.");
		
	}
	
}

// Good.  Please read aehad t the ARRAY section of the book.
