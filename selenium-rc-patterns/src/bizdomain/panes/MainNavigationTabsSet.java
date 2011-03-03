package bizdomain.panes;

import util.BasePane;
import util.elements.PageLink;
import bizdomain.pages.AccountsPage;
import bizdomain.pages.CampaignsPage;
import bizdomain.pages.ContactsPage;
import bizdomain.pages.DashBoard;
import bizdomain.pages.LeadsPage;
import bizdomain.pages.OpportunitiesPage;
import bizdomain.pages.TasksPage;


public class MainNavigationTabsSet  extends BasePane {
	public static final String PANE_IS_LOADED_CSS = "div[id=tabs]";
	
	public PageLink dashBoard;
	public PageLink tasks;
	public PageLink campaigns;
	public PageLink leads;
	public PageLink accounts;
	public PageLink contacts;
	public PageLink opportunities;
	

	public MainNavigationTabsSet() { 
		dashBoard = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Dashboard')", DashBoard.class);
		tasks = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Tasks')", TasksPage.class);
		campaigns = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Campaigns')", CampaignsPage.class);
		leads = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Leads')", LeadsPage.class);
		accounts = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Accounts')", AccountsPage.class);
		contacts = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Contacts')", ContactsPage.class);
		opportunities = new PageLink(PANE_IS_LOADED_CSS + " a:contains('Opportunities')", OpportunitiesPage.class);
	}


	@Override
	public String getPageLoadedCssLocator() {
		return PANE_IS_LOADED_CSS;
	}
}
