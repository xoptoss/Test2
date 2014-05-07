import java.util.Random;
public class dice {

	int Dices,Bounces,value;	

	Random random = new Random();
	 
	public dice(int Dices)
	{
		this.Dices = Dices;
	}
	public int Throw()
	{
		value = random.nextInt(6)+1;
		return value;
	}	
	public int Throw(int Dices)
	{
		for(int i=Dices;i>0;i--)
		{
			value = value+random.nextInt(6)+1;		
			
		}	
		
		return value;
	}

}
