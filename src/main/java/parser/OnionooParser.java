package parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import objects.ExitPolicySummary;
import objects.ExitPolicyV6Summary;
import objects.Relay;

/**
 * The OnionooParser.
 * @author quentin
 */

public class OnionooParser implements IParser {

	

	/**
	 * Instantiates a new onionoo parser.
	 */
	public OnionooParser() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see parser.IParser#get(java.lang.String)
	 */
	@Override
	public ArrayList<Relay> get(String server, String query) {
		ArrayList<Relay> relays = new ArrayList<Relay>();

		JSONObject json;
		try {
			json = readJsonFromUrl(server.concat("details?search=".concat(query)));
			JSONArray jsonRelays = json.getJSONArray("relays");
			for (int i = 0; i < jsonRelays.length(); i++) {
				JSONObject jsonRelay = (JSONObject) jsonRelays.get(i);
				relays.add(relayBuilder(jsonRelay));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return relays;
	}

	/**
	 * Relay builder. Will return a relay from a JSONObject
	 *
	 * @param jsonRelay
	 *            the JSONObject containing the relay
	 * @return the relay
	 */
	private Relay relayBuilder(JSONObject jsonRelay) {
		Relay relay = new Relay();

		if (isPresent(jsonRelay, "advertised_bandwidth")) {
			relay.setAdvertisedBandwidth((Integer) jsonRelay.get("advertised_bandwidth"));
		} else {
			relay.setAdvertisedBandwidth(null);
		}

		if (isPresent(jsonRelay, "alleged_family")) {
			ArrayList<String> allegedFamily = new ArrayList<String>();
			JSONArray jsonAllegedFamily = jsonRelay.getJSONArray("alleged_family");
			for (int i = 0; i < jsonAllegedFamily.length(); i++) {
				allegedFamily.add(jsonAllegedFamily.getString(i));
			}
			relay.setAllegedFamily(allegedFamily);
		} else {
			relay.setAllegedFamily(null);
		}

		if (isPresent(jsonRelay, "as_name")) {
			relay.setASName(jsonRelay.getString("as_name"));
		} else {
			relay.setASName(null);
		}

		if (isPresent(jsonRelay, "as_number")) {
			relay.setASNumber(jsonRelay.getString("as_number"));
		} else {
			relay.setASNumber(null);
		}

		if (isPresent(jsonRelay, "bandwidth_burst")) {
			relay.setBandwidthBurst((Integer) jsonRelay.get("bandwidth_burst"));
		} else {
			relay.setBandwidthBurst(null);
		}

		if (isPresent(jsonRelay, "bandwidth_rate")) {
			relay.setBandwidthRate((Integer) jsonRelay.get("bandwidth_rate"));
		} else {
			relay.setBandwidthRate(null);
		}

		if (isPresent(jsonRelay, "city_name")) {
			relay.setCityName(jsonRelay.getString("city_name"));
		} else {
			relay.setCityName(null);
		}

		if (isPresent(jsonRelay, "consensus_weight")) {
			relay.setConsensusWeight((Integer) jsonRelay.get("consensus_weight"));
		} else {
			relay.setConsensusWeight(null);
		}

		if (isPresent(jsonRelay, "consensus_weight_fraction")) {
			relay.setConsensusWeightFraction((Double) jsonRelay.get("consensus_weight_fraction"));
		} else {
			relay.setConsensusWeightFraction(null);
		}

		if (isPresent(jsonRelay, "contact")) {
			relay.setContact(jsonRelay.getString("contact"));
		} else {
			relay.setContact(null);
		}

		if (isPresent(jsonRelay, "country")) {
			relay.setCountryCode(jsonRelay.getString("country"));
		} else {
			relay.setCountryCode(null);
		}

		if (isPresent(jsonRelay, "country_name")) {
			relay.setCountryName(jsonRelay.getString("country_name"));
		} else {
			relay.setCountryName(null);
		}

		if (isPresent(jsonRelay, "dir_address")) {
			relay.setDirAddress(jsonRelay.getString("dir_address"));
		} else {
			relay.setDirAddress(null);
		}

		if (isPresent(jsonRelay, "effective_family")) {
			ArrayList<String> effectiveFamily = new ArrayList<String>();
			JSONArray jsonEffectiveFamily = jsonRelay.getJSONArray("effective_family");
			for (int i = 0; i < jsonEffectiveFamily.length(); i++) {
				effectiveFamily.add(jsonEffectiveFamily.getString(i));
			}

			relay.setFamily(effectiveFamily);
		} else {
			relay.setExitPolicy(null);
		}

		if (isPresent(jsonRelay, "exit_policy")) {
			ArrayList<String> exitPolicy = new ArrayList<String>();
			JSONArray jsonExitPolicy = jsonRelay.getJSONArray("exit_policy");
			for (int i = 0; i < jsonExitPolicy.length(); i++) {
				exitPolicy.add(jsonExitPolicy.getString(i));
			}
			relay.setExitPolicy(exitPolicy);
		} else {
			relay.setExitPolicy(null);
		}

		if (isPresent(jsonRelay, "exit_policy_summary")) {
			ExitPolicySummary exitPolicySummary = new ExitPolicySummary();
			JSONObject jsonExitPolicySummary = jsonRelay.getJSONObject("exit_policy_summary");

			if (isPresent(jsonExitPolicySummary, "accept")) {
				ArrayList<String> accept = new ArrayList<String>();
				JSONArray jsonAccept = jsonExitPolicySummary.getJSONArray("accept");
				for (int i = 0; i < jsonAccept.length(); i++) {
					accept.add(jsonAccept.getString(i));
				}
				exitPolicySummary.setAccept(accept);

			}

			if (isPresent(jsonExitPolicySummary, "reject")) {
				ArrayList<String> reject = new ArrayList<String>();
				JSONArray jsonReject = jsonExitPolicySummary.getJSONArray("reject");
				for (int i = 0; i < jsonReject.length(); i++) {
					reject.add(jsonReject.getString(i));
				}
				exitPolicySummary.setReject(reject);
			}

			relay.setExitPolicySummary(exitPolicySummary);
		} else {
			relay.setExitPolicySummary(null);
		}

		if (isPresent(jsonRelay, "exit_policy_v6_summary")) {
			ExitPolicyV6Summary exitPolicyV6Summary = new ExitPolicyV6Summary();
			JSONObject jsonExitPolicyV6Summary = jsonRelay.getJSONObject("exit_policy_v6_summary");

			if (isPresent(jsonExitPolicyV6Summary, "accept")) {
				ArrayList<String> accept = new ArrayList<String>();
				JSONArray jsonAccept = jsonExitPolicyV6Summary.getJSONArray("accept");
				for (int i = 0; i < jsonAccept.length(); i++) {
					accept.add(jsonAccept.getString(i));
				}
				exitPolicyV6Summary.setAccept(accept);

			}

			if (isPresent(jsonExitPolicyV6Summary, "reject")) {
				ArrayList<String> reject = new ArrayList<String>();
				JSONArray jsonReject = jsonExitPolicyV6Summary.getJSONArray("reject");
				for (int i = 0; i < jsonReject.length(); i++) {
					reject.add(jsonReject.getString(i));
				}
				exitPolicyV6Summary.setReject(reject);
			}

			relay.setExitPolicyV6Summary(exitPolicyV6Summary);
		} else {
			relay.setExitPolicyV6Summary(null);
		}

		if (isPresent(jsonRelay, "exit_probability")) {
			relay.setExitProbability((Double) jsonRelay.get("exit_probability"));
		} else {
			relay.setExitProbability(null);
		}
		if (isPresent(jsonRelay, "family")) {
			ArrayList<String> family = new ArrayList<String>();
			JSONArray jsonFamily = jsonRelay.getJSONArray("family");
			for (int i = 0; i < jsonFamily.length(); i++) {
				family.add(jsonFamily.getString(i));
			}

			relay.setFamily(family);
		} else {
			relay.setFamily(null);
		}

		if (isPresent(jsonRelay, "fingerprint")) {
			relay.setFingerprint(jsonRelay.getString("fingerprint"));
		} else {
			relay.setFingerprint(null);
		}

		if (isPresent(jsonRelay, "first_seen")) {
			relay.setFirstSeen(jsonRelay.getString("first_seen"));
		} else {
			relay.setFirstSeen(null);
		}

		if (isPresent(jsonRelay, "flags")) {
			ArrayList<String> flags = new ArrayList<String>();
			JSONArray jsonFlags = jsonRelay.getJSONArray("flags");
			for (int i = 0; i < jsonFlags.length(); i++) {
				flags.add(jsonFlags.getString(i));
			}

			relay.setFlags(flags);
		} else {
			relay.setFlags(null);
		}

		if (isPresent(jsonRelay, "guard_probability")) {
			relay.setGuardProbability((Double) jsonRelay.get("guard_probability"));
		} else {
			relay.setGuardProbability(null);
		}

		if (isPresent(jsonRelay, "host_name")) {
			relay.setHostName(jsonRelay.getString("host_name"));
		} else {
			relay.setHostName(null);
		}

		if (isPresent(jsonRelay, "last_changed_address_or_port")) {
			relay.setLastChangedAddressOrPort(jsonRelay.getString("last_changed_address_or_port"));
		} else {
			relay.setLastChangedAddressOrPort(null);
		}

		if (isPresent(jsonRelay, "last_restarted")) {
			relay.setLastRestarted(jsonRelay.getString("last_restarted"));
		} else {
			relay.setLastRestarted(null);
		}

		if (isPresent(jsonRelay, "last_seen")) {
			relay.setLastSeen(jsonRelay.getString("last_seen"));
		} else {
			relay.setLastSeen(null);
		}

		if (isPresent(jsonRelay, "latitude")) {
			relay.setLatitude((Double) jsonRelay.get("latitude"));
		} else {
			relay.setLatitude(null);
		}

		if (isPresent(jsonRelay, "longitude")) {
			relay.setLongitude((Double) jsonRelay.get("longitude"));
		} else {
			relay.setLongitude(null);
		}

		if (isPresent(jsonRelay, "measured")) {
			relay.setMeasured((Boolean) jsonRelay.get("measured"));
		} else {
			relay.setMeasured(null);
		}

		if (isPresent(jsonRelay, "middle_probability")) {
			relay.setMiddleProbability((Double) jsonRelay.get("middle_probability"));
		} else {
			relay.setMiddleProbability(null);
		}

		if (isPresent(jsonRelay, "nickname")) {
			relay.setNickname(jsonRelay.getString("nickname"));
		} else {
			relay.setNickname(null);
		}

		if (isPresent(jsonRelay, "observed_bandwidth")) {
			relay.setObservedBandwidth((Integer) jsonRelay.get("observed_bandwidth"));
		} else {
			relay.setObservedBandwidth(null);
		}

		if (isPresent(jsonRelay, "or_addresses")) {
			ArrayList<String> orAddresses = new ArrayList<String>();
			JSONArray jsonORAddresses = jsonRelay.getJSONArray("or_addresses");
			for (int i = 0; i < jsonORAddresses.length(); i++) {
				orAddresses.add(jsonORAddresses.getString(i));
			}

			relay.setOrAddresses(orAddresses);
		} else {
			relay.setOrAddresses(null);
		}

		if (isPresent(jsonRelay, "platform")) {
			relay.setPlatform(jsonRelay.getString("platform"));
		} else {
			relay.setPlatform(null);
		}

		if (isPresent(jsonRelay, "recommended_version")) {
			relay.setRecommendedVersion((Boolean) jsonRelay.get("recommended_version"));
		} else {
			relay.setRecommendedVersion(null);
		}

		if (isPresent(jsonRelay, "region_name")) {
			relay.setRegionName(jsonRelay.getString("region_name"));
		} else {
			relay.setRegionName(null);
		}

		if (isPresent(jsonRelay, "running")) {
			relay.setRunning((Boolean) jsonRelay.get("running"));
		} else {
			relay.setRunning(null);
		}

		return relay;

	}

	/**
	 * Checks if a key is present in a JSONObject.
	 *
	 * @param object
	 *            the JSONObject
	 * @param key
	 *            the key
	 * @return true, if is present
	 */
	private boolean isPresent(JSONObject object, String key) {
		
		return !(object.isNull(key));

	}

	/**
	 * Method use locally to read a JSON file.
	 *
	 * @param rd
	 *            the reader rd
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	/**
	 * Read JSON from URL.
	 *
	 * @param url
	 *            the URL
	 * @return the JSON object
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws JSONException
	 *             the JSON exception
	 */
	private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

}