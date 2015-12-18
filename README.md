# JOnionoo

Jonionoo is a simple Java API for Onionoo server.

## Features

- Search request with any keyword.

## Install

Download the latest version and type the following line in the Jonionoo folder.

```bash
$ git clone https://github.com/quentinlesceller/JOnionoo
$ mvn clean compile assembly:single
```

Or simply download the jar file in jar/JOnionoo.jar.

### Usage
Import into your Java project. Here is an example with the Onionoo server.
```
JOnionoo jonionoo = new JOnionoo("https://onionoo.torproject.org/");
ArrayList<Relay> relays = jonionoo.getRelays("B34B40B3EFCC1F40EAB01CE3B22C13ADA694765E");
```
