package com.jlopez11c.api.v1.communication.application.service.upload;

import com.jcraft.jsch.ChannelSftp;
import com.jlopez11c.api.v1.communication.application.service.dto.FileDetailDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.sftp.session.SftpRemoteFileTemplate;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.Base64;

@Slf4j
@Service
@RequiredArgsConstructor
public class SFTPServiceImpl implements SFTPService {

    @Value("${application.sftp.remote.directory.upload}")
    private String remoteDirectoryUpload;

    @Value("${application.sftp.remote.directory.download}")
    private String remoteDirectoryDownload;

    private final SftpRemoteFileTemplate sftpRemoteFileTemplate;

    @Autowired
    public SFTPServiceImpl(SessionFactory<ChannelSftp.LsEntry> sessionFactory) {
        this.sftpRemoteFileTemplate = new SftpRemoteFileTemplate(sessionFactory);
    }

    public void uploadFile(FileDetailDto fileDetails) {
        var fileName = fileDetails.getName();
        var fileContent = Base64.getDecoder().decode(fileDetails.getBase64Content());
        var byteArrayInputStream = new ByteArrayInputStream(fileContent);

        sftpRemoteFileTemplate.execute(session -> {
            session.write(byteArrayInputStream, remoteDirectoryUpload + "/" + fileName);
            return null;
        });
    }


}
