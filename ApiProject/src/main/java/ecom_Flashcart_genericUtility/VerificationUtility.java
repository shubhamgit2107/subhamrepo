package ecom_Flashcart_genericUtility;

public class VerificationUtility {
	
	public void actualVerification(String acresult,String expresult,String strategy,String pagenameortcname)
	{
		/**
		 * @ param acresult
		 * @param expresult
		 * @param strategy
		 * @param pagenameortcname
		 * @author shubh 
		 * this method is used verify tast case.
		 *  using if ,else statement.
		 */
		if(strategy.equalsIgnoreCase("Tc"))
		{
			if(acresult.equalsIgnoreCase(expresult))
			{
				System.out.println("Tc pass");
			}
			else
			{
				System.out.println("Tc fail");
			}
			
		}
		if(strategy.equalsIgnoreCase("page"))
		{
			if(acresult.equalsIgnoreCase(expresult))
			{
				System.out.println("page is display");
			}
			else
			{
				System.out.println("page is not display");
			}
			
		}
		if(strategy.equalsIgnoreCase("webElement"))
		{
			if(acresult.equalsIgnoreCase(expresult))
			{
				System.out.println("webelement is display");
			}
			else
			{
				System.out.println("webelement is not display");
			}
			
		}
	}
	
	public void partialVerification(String acresult,String expresult)
	{
		/**
		 * @param acresult
		 * @param expresult
		 * @author shubh 
		 * this method is used  for partial verification.
		 *  .
		 */
		if(acresult.contains(expresult))
		{
			System.out.println("Tc pass");
		}
		else
		{
			System.out.println("Tc fail");
		}
	}

}
