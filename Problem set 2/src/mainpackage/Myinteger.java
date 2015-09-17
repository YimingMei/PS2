package mainpackage;

public class Myinteger { 
	
	public int value;

	public int getValue() {
		return value;
	}
    public Myinteger(int value)
    {
    	this.value =value; 
    }
    
    public boolean isEven()
    {
    	if (this.getValue() % 2 == 0)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public static boolean isEven(int value)
    {
    	if (value % 2 == 0)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public static boolean isEven(Myinteger myInt)
    {
    	if (myInt.getValue() % 2 == 0)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public boolean isOdd()
    {
    	if (this.getValue() % 2 == 1)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public static boolean isOdd(int value)
    {
    	if (value % 2 == 1)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public static boolean isOdd(Myinteger myInt)
    {
    	if (myInt.getValue() % 2 == 1)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
    public boolean isPrime()
    {
    	if (this.getValue() % 2 == 0)
    	{
    		return false;
    	}
    	else 
    	{
    		return true;
    	}
    }
    public static boolean isPrime(int value)
    {
    	if (value % 2 == 0)
    	{
    		false;
    	}
    	else 
    	{
    		return true;
    	}
    }
    public static boolean isPrime(Myinteger myInt)
    {
    	if (myInt.getValue() % 2 == 0)
    	{
    		return false;
    	}
    	else 
    	{
    		return true;
    	}
    }
    
}
