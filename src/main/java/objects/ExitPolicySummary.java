package objects;

import java.util.ArrayList;

/**
 * The Class ExitPolicySummary. Corresponds to IPV4 exit policy summary.
 */
public class ExitPolicySummary {

	/** Accept list. */
	private ArrayList<String> accept;

	/** Reject list. */
	private ArrayList<String> reject;

	/**
	 * Instantiates a new exit policy summary.
	 */
	public ExitPolicySummary() {

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
	 *            the new accept list
	 */
	public void setAccept(ArrayList<String> accept) {
		this.accept = accept;
	}

	/**
	 * Gets the reject list.
	 *
	 * @return the reject
	 */
	public ArrayList<String> getReject() {
		return reject;
	}

	/**
	 * Sets the reject list.
	 *
	 * @param reject
	 *            the new reject
	 */
	public void setReject(ArrayList<String> reject) {
		this.reject = reject;
	}
}
