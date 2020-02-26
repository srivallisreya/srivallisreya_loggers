package interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class logg_task {
	private static final Logger s=LogManager.getLogger(logg_task.class);

	public static void main(String args[]) {
		
		
		s.info("interest task\n");
		
		s.info("creating object for simple interest class");
		
		simple_interest simple_interest_obj=new simple_interest();
		simple_interest_obj.setValues(1000,20,30);
		s.info("Simple Interest is : "+simple_interest_obj.getSimpleInterest()+"\n");
		
		s.info("creating object for class compound interest");
		compound_interest compound_interest_obj=new compound_interest();
		compound_interest_obj.setValues(1000,20,30);
		s.info("Compound Interest is : "+compound_interest_obj.getcompoundinterest()+"\n\n");
		
		s.info("House construction task\n");
		
		s.info("creating object for house_cal");
		
		house_cal house=new house_cal();
		
		house.setValues(12.5,"standard","no");
		
		s.info("calling gettotalamount method in class");
		
		
		s.info("Total construction cost : "+house.gettotalamount());
		
	}

}
