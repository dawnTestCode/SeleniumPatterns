package quickfind;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bizdomain.common.BaseWebTest;
import bizdomain.common.CommonComponents;
import bizdomain.pages.SmithamAndSonsPage;
import bizdomain.panes.QuickFindBox;

public class FindAccountTest extends BaseWebTest {
	
	@Test
	public void canFindExistingAccount() throws Exception {
		QuickFindBox quickFind = CommonComponents.topRightLinks.quickFind.clickToNewContainer();
		quickFind.accountsMenuItem.click();
		
		SmithamAndSonsPage smithamAndSonsPage = (SmithamAndSonsPage) quickFind.searchForAccount("Smitha", SmithamAndSonsPage.class);
		assertTrue(smithamAndSonsPage.title.reads("Smitham and Sons"));
	}
}
