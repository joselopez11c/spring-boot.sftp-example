package com.jlopez11c.api.v1.communication.configuration.sftp.props;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "application.sftp")
public class SftpProperties {

    private String host;
    private Integer port;
    private String user;
    private String password;
    private Boolean unknownKeys;

}
