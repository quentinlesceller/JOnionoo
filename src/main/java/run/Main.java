package run;

import java.util.ArrayList;

import objects.Relay;

public class Main {

	public static void main(String[] args) {
		JOnionoo jonionoo = new JOnionoo("https://onionoo.torproject.org/");
		 ArrayList<Relay> relays = jonionoo.getRelays("B34B40B3EFCC1F40EAB01CE3B22C13ADA694765E");
		System.out.println(relays.size());
		// System.out.println(relays.get(0).getCountryCode());
	}

}