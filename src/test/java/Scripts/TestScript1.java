package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.AddtocartPage;
import pompages.SkillraryDemoLoginPage;
import pompages.SkillraryLoginPage;

public class TestScript1 extends BaseClass {
	
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtocartPage d=new AddtocartPage(driver);
		utilies.doubleClick(driver, d.getAddiconbtn());
		d.addtocartbutton();
		utilies.alertPopup(driver);
	}

}
