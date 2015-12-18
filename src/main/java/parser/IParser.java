package parser;

import java.util.ArrayList;

import objects.Relay;

/**
 * The Interface for the Parser.
 * 
 * @author quentin
 */
public interface IParser {

	/**
	 * Gets the relay associated to a query.
	 *
	 * @param server
	 *            the Onionoo server
	 * @param query
	 *            the query
	 * @return the array list
	 */
	public ArrayList<Relay> get(String server, String query);
}
