package de.tsb.Events;

import com.github.theholywaffle.teamspeak3.api.event.ChannelCreateEvent;
import com.github.theholywaffle.teamspeak3.api.event.ChannelDeletedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ChannelDescriptionEditedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ChannelEditedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ChannelMovedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ChannelPasswordChangedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ClientJoinEvent;
import com.github.theholywaffle.teamspeak3.api.event.ClientLeaveEvent;
import com.github.theholywaffle.teamspeak3.api.event.ClientMovedEvent;
import com.github.theholywaffle.teamspeak3.api.event.PrivilegeKeyUsedEvent;
import com.github.theholywaffle.teamspeak3.api.event.ServerEditedEvent;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import com.github.theholywaffle.teamspeak3.api.event.TextMessageEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Client;

import de.tsb.Main.Load;

public class events {
	
	public static void Load() {
		int whoAmi = Load.api.whoAmI().getId();
		Load.api.registerAllEvents();
		Load.api.addTS3Listeners(new TS3Listener() {
			
			@Override
			public void onTextMessage(TextMessageEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onServerEdit(ServerEditedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPrivilegeKeyUsed(PrivilegeKeyUsedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onClientMoved(ClientMovedEvent e) {
				if (e.getTargetChannelId() == 360) {
					int i = 0;
				for (Client sup : Load.api.getClients()) {
					if (!(sup.isServerQueryClient())) {
						for (int a = 0; a < sup.getServerGroups().length; a++) {
							if (sup.getServerGroups()[a] == 166) {
								i++;
				Load.api.sendPrivateMessage(sup.getId(), "[color=blue][b]Jemand benötigt Supporttechnische Hilfe![/b][/color]");
							
							}
						
						}
							
					}
					
				}				Load.api.sendPrivateMessage(e.getClientId(), "[color=blue][b]" + i + " [color=red]Supporter wurden benachrichtigt, um dir zu helfen![/color][/b]");
				
			}
			
		

			}
			
			@Override
			public void onClientLeave(ClientLeaveEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onClientJoin(ClientJoinEvent c) {
			int peter = c.getClientId(); 
			de.tsb.Main.Load.api.sendPrivateMessage(peter, "Hey," + c.getClientNickname() + "Willkommen auf Proxygames"); 
							
				
			}
			
			@Override
			public void onChannelPasswordChanged(ChannelPasswordChangedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onChannelMoved(ChannelMovedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onChannelEdit(ChannelEditedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onChannelDescriptionChanged(ChannelDescriptionEditedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onChannelDeleted(ChannelDeletedEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onChannelCreate(ChannelCreateEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
