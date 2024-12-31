package com.jlopez11c.api.v1.communication.configuration.sftp;

import com.jlopez11c.api.v1.communication.configuration.sftp.props.SftpProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(SftpProperties.class)
public class SftpConfig {

    private final SftpProperties sftpProperties;

    @Bean
    public DefaultSftpSessionFactory sftpSessionFactory() {
        var factory = new DefaultSftpSessionFactory(true);
        factory.setHost(sftpProperties.getHost());
        factory.setPort(sftpProperties.getPort());
        factory.setUser(sftpProperties.getUser());
        factory.setPassword(sftpProperties.getPassword());
        factory.setAllowUnknownKeys(sftpProperties.getUnknownKeys());
        return factory;
    }

}
