package quickfind;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bizdomain.common.BaseWebTest;
import bizdomain.common.CommonComponents;
import bizdomain.pages.SmithamAndSonsPage;
import bizdomain.panes.QuickFindBox;

public class FindAccountTest extends BaseWebTest {
	
	@SuppressWarnings("unchecked")
	@Test
	public void canFindExistingAccount() throws Exception {
		QuickFindBox<SmithamAndSonsPage> quickFind = CommonComponents.topRightLinks.quickFind.clickToNewContainer();
		
		SmithamAndSonsPage smithamAndSonsPage = quickFind.searchForAccount("Smitha", SmithamAndSonsPage.class);
		assertTrue(smithamAndSonsPage.title.reads("Smitham and Sons"));
	}
}
