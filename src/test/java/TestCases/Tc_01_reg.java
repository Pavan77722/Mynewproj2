package TestCases;

import org.testng.annotations.Test;

import pageobjdl001.Pom001;



public class Tc_01_reg extends Baseclass {
	@Test
	public void Regtest() throws InterruptedException {
		Pom001 rp=new Pom001(driver);
		rp.clickregister();
		rp.setname("pavan");
		rp.setloginname("kumar87879");
		rp.setemail("pavan.ganj76767@gmail.com");
		rp.setmobile("(201)555-5005");
		rp.setlandline("(201)555-9958");
		rp.clicknext();
		rp.setpassword("Pavan67890");
		rp.setconfirmpassword("Pavan67890");
		rp.DemoCheckbox();
		Thread.sleep(20000);
		
		rp.clicksubmit();
	}

}