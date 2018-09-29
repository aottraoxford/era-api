package com.eracambodia.era.configuration.socket;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration*/
public class EraSocket {
    @Value("0.0.0.0")
    private String host;
    @Value("9090")
    private Integer port;
    /*@Bean*/
    public SocketIOServer socketIOServer(){
        com.corundumstudio.socketio.Configuration configuration=new com.corundumstudio.socketio.Configuration();
        configuration.setHostname(host);
        configuration.setPort(port);
        return new SocketIOServer(configuration);
    }
}
