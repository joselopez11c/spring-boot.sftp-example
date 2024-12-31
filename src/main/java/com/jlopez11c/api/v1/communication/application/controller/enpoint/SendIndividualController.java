package com.jlopez11c.api.v1.communication.application.controller.enpoint;

import com.jlopez11c.api.v1.communication.application.controller.mapper.CommunicationControllerMapper;
import com.jlopez11c.api.v1.communication.application.controller.request.FileTransferDownloadRequest;
import com.jlopez11c.api.v1.communication.application.controller.request.FileTransferUploadRequest;
import com.jlopez11c.api.v1.communication.application.controller.response.FileTransferResponse;
import com.jlopez11c.api.v1.communication.application.service.CommunicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/communication")
public class SendIndividualController {

    private final CommunicationService service;
    private final CommunicationControllerMapper mapper;

    @PostMapping("/upload")
    @ResponseStatus(HttpStatus.OK)
    public FileTransferResponse uploadFile(@RequestBody FileTransferUploadRequest request) {
        var dto = mapper.mapRequestToDto(request);
        var response =  service.uploadFileSftp(dto);
       return mapper.mapDtoToResponse(response);
    }

    @PostMapping("/download")
    @ResponseStatus(HttpStatus.OK)
    public FileTransferResponse downloadFile(@RequestBody FileTransferDownloadRequest request) {
        var dto = mapper.mapRequestToDto(request);
        var response =  service.downloadFileSftp(dto);
        return mapper.mapDtoToResponse(response);
    }


}
