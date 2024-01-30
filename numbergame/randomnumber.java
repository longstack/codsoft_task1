package numbergame;
import java.util.Random;
//import java.util.Scanner;


public class randomnumber
{
	private int min;
    private int max;
    private Random randomnumber;

    public randomnumber(int min, int max)
    {
    	if (min > max) {
            throw new IllegalArgumentException("minRange must be less than or equal to maxRange");
        }
    	
    	
    	
    	
    	
    	this.max = max;
        this.min = min;
        
        this.randomnumber = new Random();
    }

    public int getrandomnumber() 
    {   int val;
     val=randomnumber.nextInt(max - min + 1) + min;
        return val;
    }
}
