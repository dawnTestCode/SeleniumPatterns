package bizdomain.pages;

import util.BasePage;
import util.elements.TextLabel;

public class SmithamAndSonsPage extends BasePage {
	private static final String PAGE_IS_LOADED_CSS = "div[id=edit_account_title]:contains('Smitham and Sons')";
	public TextLabel title;
	
	public SmithamAndSonsPage() throws Exception {
		super();
		title = new TextLabel( "div[class=title][id=edit_account_title]");
	}

	@Override
	public String getPageLoadedCssLocator() {
		return PAGE_IS_LOADED_CSS;
	}


}
