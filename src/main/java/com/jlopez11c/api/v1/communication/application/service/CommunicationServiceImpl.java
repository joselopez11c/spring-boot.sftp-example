package com.jlopez11c.api.v1.communication.application.service;

import com.jlopez11c.api.v1.communication.application.service.dto.FileTransferDto;
import com.jlopez11c.api.v1.communication.application.service.mapper.CommunicationServiceMapper;
import com.jlopez11c.api.v1.communication.application.service.upload.SFTPServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class CommunicationServiceImpl implements CommunicationService {

    private final SFTPServiceImpl sftpService;
    private final CommunicationServiceMapper mapper;

    @Override
    public FileTransferDto uploadFileSftp(FileTransferDto dto) {
        sftpService.uploadFile(dto.getFileDetails());
        return dto;
    }

    @Override
    public FileTransferDto downloadFileSftp(FileTransferDto dto) {
        return null;
    }

}
