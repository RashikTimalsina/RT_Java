import java.lang.*;
class LogicalOperatorMosh2
{

	public static void main(String[] args)
	{

	boolean hasHighIncome=true;
	boolean hasGoodCredit=true;
	boolean hasCriminalRecord=false;
	
	//Should have either HighIncome OR GoodCredit AND  NOT having criminalrecord to be eligible

	boolean isEligible=(hasHighIncome || hasGoodCredit)	 && !hasCriminalRecord;

	System.out.println(isEligible);
	}


}