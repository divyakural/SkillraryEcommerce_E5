package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.SkillraryDemoLoginPage;
import pompages.SkillraryLoginPage;
import pompages.TestingPage;

public class TestScript2 extends BaseClass {		
		@Test
		public void tc1() throws Throwable
		{
			SkillraryLoginPage s=new SkillraryLoginPage(driver);
			s.gearsbutton();
			s.skillrarydemoapplication();
			utilies.switchingtabs(driver);
			SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
			utilies.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
			TestingPage tp=new TestingPage(driver);
			utilies.dragdrop(driver, tp.getSeleniumtrainingdrag(), tp.getMycartdrop());
}
}