package quickfind;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bizdomain.common.BaseWebTest;
import bizdomain.common.CommonComponents;
import bizdomain.pages.SmithamPage;
import bizdomain.panes.QuickFindBox;

public class FindAccountTest extends BaseWebTest {
	
	@SuppressWarnings("unchecked")
	@Test
	public void canFindExistingAccount() throws Exception {
		QuickFindBox<SmithamPage> quickFind = CommonComponents.topRightLinks.quickFind.clickToNewContainer();
		
		SmithamPage smithamAndSonsPage = quickFind.searchForAccount("Smitha", SmithamPage.class);
		assertTrue(smithamAndSonsPage.title.reads("Smitham and Sons"));
	}
}
