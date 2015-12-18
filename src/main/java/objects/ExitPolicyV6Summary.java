package objects;

import java.util.ArrayList;

/**
 * The Class ExitPolicyV6Summary. Corresponds to IPV6 exit policy summary.
 * 
 * @author quentin
 */
public class ExitPolicyV6Summary {

	/** The accept list. */
	private ArrayList<String> accept;

	/** The reject list. */
	private ArrayList<String> reject;

	/**
	 * Instantiates a new exit policy v6 summary.
	 */
	public ExitPolicyV6Summary() {

	}

	/**
	 * Gets the accept list.
	 *
	 * @return the accept list
	 */
	public ArrayList<String> getAccept() {
		return accept;
	}

	/**
	 * Sets the accept list.
	 *
	 * @param accept
	 *            the new accept
	 */
	public void setAccept(ArrayList<String> accept) {
		this.accept = accept;
	}

	/**
	 * Gets the reject list.
	 *
	 * @return the reject list
	 */
	public ArrayList<String> getReject() {
		return reject;
	}

	/**
	 * Sets the reject list.
	 *
	 * @param reject
	 *            the new reject list
	 */
	public void setReject(ArrayList<String> reject) {
		this.reject = reject;
	}

}
