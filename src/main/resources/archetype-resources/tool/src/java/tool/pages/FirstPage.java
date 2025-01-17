#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.tool.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.StringResourceModel;

import org.apache.wicket.model.Model; // For Model.of() in Wicket
import java.util.Arrays; // For Arrays.asList()

/**
 * An example page
 * 
 * @author Steve Swinsburg (steve.swinsburg@anu.edu.au)
 *
 */
public class FirstPage extends BasePage {

	private static final String DATE_FORMAT="dd-MMM-yyyy";
	private static final String TIME_FORMAT="HH:mm:ss";
	
	
	public FirstPage() {
		disableLink(firstLink);
		
		//name
		add(new Label("userDisplayName", sakaiProxy.getCurrentUserDisplayName()));
		
		//time
		Date d = new Date();
		String date = new SimpleDateFormat(DATE_FORMAT).format(d);
		String time = new SimpleDateFormat(TIME_FORMAT).format(d);

		add(new Label("time", new StringResourceModel("the.time", null, Model.ofList(Arrays.asList(date, time)))));
		
	}
}
