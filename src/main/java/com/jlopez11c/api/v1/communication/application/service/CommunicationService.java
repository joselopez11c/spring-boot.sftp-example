package com.jlopez11c.api.v1.communication.application.service;

import com.jlopez11c.api.v1.communication.application.service.dto.FileTransferDto;

public interface CommunicationService {

    
    FileTransferDto uploadFileSftp(FileTransferDto dto);

    FileTransferDto downloadFileSftp(FileTransferDto dto);
}
