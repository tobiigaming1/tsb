package de.tsb.Main;

import org.slf4j.event.Level;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.TS3Query.FloodRate;

import de.tsb.Events.events;

public class Load {
	
	public static final TS3Config config = new TS3Config();
	public static final TS3Query query = new TS3Query(config);
	public static final TS3Api api = query.getApi();

	private void config() {
		public static void main(String[] args) {
			System.out.println("Bot is starting...");
			config.setHost("127.0.0.1");
			config.setFloodRate(FloodRate.UNLIMITED);

		config.setHost("127.0.0.1");
		// config.setEnableCommunicationsLogging(enable);
		
		config.setFloodRate(TS3Query.FloodRate.UNLIMITED);
		
		query.connect();
		
		api.login("yourname", "yourpassword");
		api.selectVirtualServerByPort(9987);
		api.setNickname("Bot");
		api.sendServerMessage("[B]Der Bot wurde gestartet ![/B]");
		System.out.println("Bot is now running and connected");
		
		events.Load();

	}
}
