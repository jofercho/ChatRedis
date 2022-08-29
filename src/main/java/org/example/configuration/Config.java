package org.example.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "my")
public class Config {
    private final List<String> servers = new ArrayList<>();

    public List<String> getServers(){
        return this.servers;
    }
}
