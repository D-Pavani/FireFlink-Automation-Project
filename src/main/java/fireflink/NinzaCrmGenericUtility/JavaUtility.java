package fireflink.NinzaCrmGenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consists of generic methods related to 
 * generating the random number and today date
 * @author Dammavalam Pavani
 */
public class JavaUtility
{
	/**
	 * This method will generate the random number and return it to caller
	 * @param llimit
	 * @param ulimit
	 * @return
	 */
	
	 public int randomNum(int llimit,int ulimit)
	 {
		 Random r=new Random();
		return r.nextInt(llimit, ulimit);	 
	 }
	
//	 orrrrrrr  ---- for user friendly 
	 public int randomNum()
	 {
		 Random r=new Random();
		return r.nextInt(10000);	 
	 }
	 
	 /**
	  * This method will generate the today date and return it to caller
	  * @return
	  */
	 public String getSysDate()
	 {
		 
		 Date d=new Date();
		 SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		 return s.format(d);
		 
	 }
}
