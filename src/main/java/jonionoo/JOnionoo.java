package jonionoo;

import java.util.ArrayList;

import objects.Relay;
import parser.IParser;
import parser.OnionooParser;

/**
 * The Class Jonionoo. Main instance of the program.
 * 
 * @author quentin
 */
public class JOnionoo {

	/** The parser. */
	private IParser parser;

	/** The server. */
	private String server;

	/**
	 * Instantiates a new JOnionoo.
	 *
	 * @param server
	 *            the server
	 */
	public JOnionoo(String server) {
		this.server = server;
		parser = new OnionooParser();
	}

	/**
	 * Gets the relay from a Onionoo query.
	 *
	 * @param query
	 *            the fingerprint
	 * @return the relay information
	 */
	public ArrayList<Relay> getRelays(String query) {

		return parser.get(server, query);
	}
}
