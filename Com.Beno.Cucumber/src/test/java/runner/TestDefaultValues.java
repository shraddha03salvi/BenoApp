package runner;

import org.apache.commons.lang3.StringUtils;

public class TestDefaultValues {

	public static final String DEFAULT_OPERATING_SYSTEM = "Mac";
	public static final String DEFAULT_BROWSER = "Chrome";
	public static final String DEFAULT_link= "http://stg.beno.com";
	
	//Static variables
		private static String operatingSystem;
		private static String browser;
		private static String link;
		//Get and Set Opearting System
		public static String getOperatingSystem() {
			return StringUtils.isEmpty(operatingSystem) ? DEFAULT_OPERATING_SYSTEM : operatingSystem ;
			}
		public static void setOperatingSystem(String operatingSystem) 
		{
			TestDefaultValues.operatingSystem = operatingSystem ;
		}
		public static String getBrowser() {
			return StringUtils.isEmpty(browser) ? DEFAULT_OPERATING_SYSTEM : browser ;}
		public static void setBrowser(String browser) 
		{
			TestDefaultValues.browser = browser ;
		}
		public static String getLink() {
			return StringUtils.isEmpty(link) ? DEFAULT_link :  link ;
			
			
		}
		public static void setLink(String link) 
		{
			TestDefaultValues.link = link ;
		}

}
