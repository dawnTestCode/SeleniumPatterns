package quickfind;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bizdomain.common.BaseWebTest;
import bizdomain.common.CommonComponents;
import bizdomain.pages.AccountPage;
import bizdomain.panes.QuickFindBox;

public class FindAccountTest extends BaseWebTest {
	
	@Test
	public void canFindExistingAccount() throws Exception {
		QuickFindBox quickFind = (QuickFindBox) CommonComponents.topRightLinks.quickFind.clickToNewContainer();
		quickFind.accountsMenuItem.click();
		
		AccountPage huckabiesPage = (AccountPage) quickFind.searchForAccount("Huckab", AccountPage.class);
		assertTrue(huckabiesPage.title.reads("Huckabies"));
	}
	

}
