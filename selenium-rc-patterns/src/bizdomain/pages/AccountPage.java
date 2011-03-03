package bizdomain.pages;

import util.BasePage;
import util.elements.TextLabel;

public class AccountPage extends BasePage {
	private static final String PAGE_IS_LOADED_CSS = "div[id=edit_account_title]:contains('Huckabies')";
	public TextLabel title;
	
	public AccountPage() throws Exception {
		super();
		title = new TextLabel( "div[class=title][id=edit_account_title]");
	}

	@Override
	public String getPageLoadedCssLocator() {
		return PAGE_IS_LOADED_CSS;
	}


}
