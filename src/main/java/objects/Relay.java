package objects;

import java.util.ArrayList;

/**
 * The Relay object.
 * 
 * @author quentin
 */
public class Relay {

	/** The nickname. */
	private String nickname;

	/** The fingerprint. */
	private String fingerprint;

	/** The onion router addresses. */
	private ArrayList<String> orAddresses;

	/** The directory address. */
	private String dirAddress;

	/** The last seen date. */
	private String lastSeen;

	/** The last changed address or port date. */
	private String lastChangedAddressOrPort;

	/** The first seen date. */
	private String firstSeen;

	/** The running. */
	private Boolean running;

	/** The flags. */
	private ArrayList<String> flags;

	/** The country code. */
	private String countryCode;

	/** The country name. */
	private String countryName;

	/** The region name. */
	private String regionName;

	/** The city name. */
	private String cityName;

	/** The latitude. */
	private Double latitude;

	/** The longitude. */
	private Double longitude;

	/** The autonomous system number. */
	private String asNumber;

	/** The autonomous system name. */
	private String asName;

	/** The consensus weight. */
	private Integer consensusWeight;

	/** The host name. */
	private String hostName;

	/** The last restarted date. */
	private String lastRestarted;

	/** The bandwidth rate. */
	private Integer bandwidthRate;

	/** The bandwidth burst. */
	private Integer bandwidthBurst;

	/** The observed bandwidth. */
	private Integer observedBandwidth;

	/** The advertised bandwidth. */
	private Integer advertisedBandwidth;

	/** The exit policy. */
	private ArrayList<String> exitPolicy;

	/** The exit policy summary. */
	private ExitPolicySummary exitPolicySummary;

	/** The exit policy v6 summary. */
	private ExitPolicyV6Summary exitPolicyV6Summary;

	/** The contact. */
	private String contact;

	/** The platform. */
	private String platform;

	/** The family. */
	private ArrayList<String> family;

	/** The alleged family. */
	private ArrayList<String> allegedFamily;

	/** The effective family. */
	private ArrayList<String> effectiveFamily;

	/** The consensus weight fraction. */
	private Double consensusWeightFraction;

	/** The guard probability. */
	private Double guardProbability;

	/** The middle probability. */
	private Double middleProbability;

	/** The exit probability. */
	private Double exitProbability;

	/** The recommended version. */
	private Boolean recommendedVersion;

	/** The measured. */
	private Boolean measured;

	/**
	 * Gets the effective family.
	 *
	 * @return the effective family
	 */
	public ArrayList<String> getEffectiveFamily() {
		return effectiveFamily;
	}

	/**
	 * Sets the effective family.
	 *
	 * @param effectiveFamily
	 *            the new effective family
	 */
	public void setEffectiveFamily(ArrayList<String> effectiveFamily) {
		this.effectiveFamily = effectiveFamily;
	}

	/**
	 * Instantiates a new relay.
	 */
	public Relay() {

	}

	/**
	 * Gets the nickname.
	 *
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Sets the nickname.
	 *
	 * @param nickname
	 *            the new nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Gets the fingerprint.
	 *
	 * @return the fingerprint
	 */
	public String getFingerprint() {
		return fingerprint;
	}

	/**
	 * Sets the fingerprint.
	 *
	 * @param fingerprint
	 *            the new fingerprint
	 */
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	/**
	 * Gets the onion router addresses.
	 *
	 * @return the onion router addresses
	 */
	public ArrayList<String> getOrAddresses() {
		return orAddresses;
	}

	/**
	 * Sets the onion router addresses.
	 *
	 * @param orAddresses
	 *            the new onion router addresses
	 */
	public void setOrAddresses(ArrayList<String> orAddresses) {
		this.orAddresses = orAddresses;
	}

	/**
	 * Gets the directory address.
	 *
	 * @return the directory address
	 */
	public String getDirAddress() {
		return dirAddress;
	}

	/**
	 * Sets the directory address.
	 *
	 * @param dirAddress
	 *            the new directory address
	 */
	public void setDirAddress(String dirAddress) {
		this.dirAddress = dirAddress;
	}

	/**
	 * Gets the last seen.
	 *
	 * @return the last seen
	 */
	public String getLastSeen() {
		return lastSeen;
	}

	/**
	 * Sets the last seen.
	 *
	 * @param lastSeen
	 *            the new last seen
	 */
	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	/**
	 * Gets the last changed address or port.
	 *
	 * @return the last changed address or port
	 */
	public String getLastChangedAddressOrPort() {
		return lastChangedAddressOrPort;
	}

	/**
	 * Sets the last changed address or port date.
	 *
	 * @param lastChangedAddressOrPort
	 *            the new last changed address or port date
	 */
	public void setLastChangedAddressOrPort(String lastChangedAddressOrPort) {
		this.lastChangedAddressOrPort = lastChangedAddressOrPort;
	}

	/**
	 * Gets the first seen date.
	 *
	 * @return the first seen date
	 */
	public String getFirstSeen() {
		return firstSeen;
	}

	/**
	 * Sets the first seen date.
	 *
	 * @param firstSeen
	 *            the new first seen date
	 */
	public void setFirstSeen(String firstSeen) {
		this.firstSeen = firstSeen;
	}

	/**
	 * Gets the running.
	 *
	 * @return the running
	 */
	public Boolean getRunning() {
		return running;
	}

	/**
	 * Sets the running.
	 *
	 * @param running
	 *            the new running
	 */
	public void setRunning(Boolean running) {
		this.running = running;
	}

	/**
	 * Gets the flags.
	 *
	 * @return the flags
	 */
	public ArrayList<String> getFlags() {
		return flags;
	}

	/**
	 * Sets the flags.
	 *
	 * @param flags
	 *            the new flags
	 */
	public void setFlags(ArrayList<String> flags) {
		this.flags = flags;
	}

	/**
	 * Gets the country code.
	 *
	 * @return the country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the country code.
	 *
	 * @param countryCode
	 *            the new country code
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the country name.
	 *
	 * @return the country name
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the country name.
	 *
	 * @param countryName
	 *            the new country name
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Gets the region name.
	 *
	 * @return the region name
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * Sets the region name.
	 *
	 * @param regionName
	 *            the new region name
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * Gets the city name.
	 *
	 * @return the city name
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Sets the city name.
	 *
	 * @param cityName
	 *            the new city name
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude
	 *            the new latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude
	 *            the new longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the autonomous system number.
	 *
	 * @return the autonomous system number
	 */
	public String getASNumber() {
		return asNumber;
	}

	/**
	 * Sets the autonomous system number.
	 *
	 * @param asNumber
	 *            the new autonomous system number
	 */
	public void setASNumber(String asNumber) {
		this.asNumber = asNumber;
	}

	/**
	 * Gets the autonomous system name.
	 *
	 * @return the autonomous system name
	 */
	public String getASName() {
		return asName;
	}

	/**
	 * Sets the autonomous system name.
	 *
	 * @param asName
	 *            the new autonomous system name
	 */
	public void setASName(String asName) {
		this.asName = asName;
	}

	/**
	 * Gets the consensus weight.
	 *
	 * @return the consensus weight
	 */
	public Integer getConsensusWeight() {
		return consensusWeight;
	}

	/**
	 * Sets the consensus weight.
	 *
	 * @param consensusWeight
	 *            the new consensus weight
	 */
	public void setConsensusWeight(Integer consensusWeight) {
		this.consensusWeight = consensusWeight;
	}

	/**
	 * Gets the host name.
	 *
	 * @return the host name
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Sets the host name.
	 *
	 * @param hostName
	 *            the new host name
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Gets the last restarted date.
	 *
	 * @return the last restarted date
	 */
	public String getLastRestarted() {
		return lastRestarted;
	}

	/**
	 * Sets the last restarted date.
	 *
	 * @param lastRestarted
	 *            the new last restarted date
	 */
	public void setLastRestarted(String lastRestarted) {
		this.lastRestarted = lastRestarted;
	}

	/**
	 * Gets the bandwidth rate.
	 *
	 * @return the bandwidth rate
	 */
	public Integer getBandwidthRate() {
		return bandwidthRate;
	}

	/**
	 * Sets the bandwidth rate.
	 *
	 * @param bandwidthRate
	 *            the new bandwidth rate
	 */
	public void setBandwidthRate(Integer bandwidthRate) {
		this.bandwidthRate = bandwidthRate;
	}

	/**
	 * Gets the bandwidth burst.
	 *
	 * @return the bandwidth burst
	 */
	public Integer getBandwidthBurst() {
		return bandwidthBurst;
	}

	/**
	 * Sets the bandwidth burst.
	 *
	 * @param bandwidthBurst
	 *            the new bandwidth burst
	 */
	public void setBandwidthBurst(Integer bandwidthBurst) {
		this.bandwidthBurst = bandwidthBurst;
	}

	/**
	 * Gets the observed bandwidth.
	 *
	 * @return the observed bandwidth
	 */
	public Integer getObservedBandwidth() {
		return observedBandwidth;
	}

	/**
	 * Sets the observed bandwidth.
	 *
	 * @param observedBandwidth
	 *            the new observed bandwidth
	 */
	public void setObservedBandwidth(Integer observedBandwidth) {
		this.observedBandwidth = observedBandwidth;
	}

	/**
	 * Gets the advertised bandwidth.
	 *
	 * @return the advertised bandwidth
	 */
	public Integer getAdvertisedBandwidth() {
		return advertisedBandwidth;
	}

	/**
	 * Sets the advertised bandwidth.
	 *
	 * @param advertisedBandwidth
	 *            the new advertised bandwidth
	 */
	public void setAdvertisedBandwidth(Integer advertisedBandwidth) {
		this.advertisedBandwidth = advertisedBandwidth;
	}

	/**
	 * Gets the exit policy.
	 *
	 * @return the exit policy
	 */
	public ArrayList<String> getExitPolicy() {
		return exitPolicy;
	}

	/**
	 * Sets the exit policy.
	 *
	 * @param exitPolicy
	 *            the new exit policy
	 */
	public void setExitPolicy(ArrayList<String> exitPolicy) {
		this.exitPolicy = exitPolicy;
	}

	/**
	 * Gets the exit policy summary.
	 *
	 * @return the exit policy summary
	 */
	public ExitPolicySummary getExitPolicySummary() {
		return exitPolicySummary;
	}

	/**
	 * Sets the exit policy summary.
	 *
	 * @param exitPolicySummary
	 *            the new exit policy summary
	 */
	public void setExitPolicySummary(ExitPolicySummary exitPolicySummary) {
		this.exitPolicySummary = exitPolicySummary;
	}

	/**
	 * Gets the exit policy v6 summary.
	 *
	 * @return the exit policy v6 summary
	 */
	public ExitPolicyV6Summary getExitPolicyV6Summary() {
		return exitPolicyV6Summary;
	}

	/**
	 * Sets the exit policy v6 summary.
	 *
	 * @param exitPolicyV6Summary
	 *            the new exit policy v6 summary
	 */
	public void setExitPolicyV6Summary(ExitPolicyV6Summary exitPolicyV6Summary) {
		this.exitPolicyV6Summary = exitPolicyV6Summary;
	}

	/**
	 * Gets the contact.
	 *
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * Sets the contact.
	 *
	 * @param contact
	 *            the new contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * Gets the platform.
	 *
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * Sets the platform.
	 *
	 * @param platform
	 *            the new platform
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Gets the family.
	 *
	 * @return the family
	 */
	public ArrayList<String> getFamily() {
		return family;
	}

	/**
	 * Sets the family.
	 *
	 * @param family
	 *            the new family
	 */
	public void setFamily(ArrayList<String> family) {
		this.family = family;
	}

	/**
	 * Gets the alleged family.
	 *
	 * @return the alleged family
	 */
	public ArrayList<String> getAllegedFamily() {
		return allegedFamily;
	}

	/**
	 * Sets the alleged family.
	 *
	 * @param allegedFamily
	 *            the new alleged family
	 */
	public void setAllegedFamily(ArrayList<String> allegedFamily) {
		this.allegedFamily = allegedFamily;
	}

	/**
	 * Gets the consensus weight fraction.
	 *
	 * @return the consensus weight fraction
	 */
	public Double getConsensusWeightFraction() {
		return consensusWeightFraction;
	}

	/**
	 * Sets the consensus weight fraction.
	 *
	 * @param consensusWeightFraction
	 *            the new consensus weight fraction
	 */
	public void setConsensusWeightFraction(Double consensusWeightFraction) {
		this.consensusWeightFraction = consensusWeightFraction;
	}

	/**
	 * Gets the guard probability.
	 *
	 * @return the guard probability
	 */
	public Double getGuardProbability() {
		return guardProbability;
	}

	/**
	 * Sets the guard probability.
	 *
	 * @param guardProbability
	 *            the new guard probability
	 */
	public void setGuardProbability(Double guardProbability) {
		this.guardProbability = guardProbability;
	}

	/**
	 * Gets the middle probability.
	 *
	 * @return the middle probability
	 */
	public Double getMiddleProbability() {
		return middleProbability;
	}

	/**
	 * Sets the middle probability.
	 *
	 * @param middleProbability
	 *            the new middle probability
	 */
	public void setMiddleProbability(Double middleProbability) {
		this.middleProbability = middleProbability;
	}

	/**
	 * Gets the exit probability.
	 *
	 * @return the exit probability
	 */
	public Double getExitProbability() {
		return exitProbability;
	}

	/**
	 * Sets the exit probability.
	 *
	 * @param exitProbability
	 *            the new exit probability
	 */
	public void setExitProbability(Double exitProbability) {
		this.exitProbability = exitProbability;
	}

	/**
	 * Gets the recommended version.
	 *
	 * @return the recommended version
	 */
	public Boolean getRecommendedVersion() {
		return recommendedVersion;
	}

	/**
	 * Sets the recommended version.
	 *
	 * @param recommendedVersion
	 *            the new recommended version
	 */
	public void setRecommendedVersion(Boolean recommendedVersion) {
		this.recommendedVersion = recommendedVersion;
	}

	/**
	 * Gets the measured.
	 *
	 * @return the measured
	 */
	public Boolean getMeasured() {
		return measured;
	}

	/**
	 * Sets the measured.
	 *
	 * @param measured
	 *            the new measured
	 */
	public void setMeasured(Boolean measured) {
		this.measured = measured;
	}

}
