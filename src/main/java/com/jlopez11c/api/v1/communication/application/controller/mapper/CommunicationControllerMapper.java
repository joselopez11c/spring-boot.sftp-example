package com.jlopez11c.api.v1.communication.application.controller.mapper;

import com.jlopez11c.api.v1.communication.application.controller.request.FileTransferDownloadRequest;
import com.jlopez11c.api.v1.communication.application.controller.request.FileTransferUploadRequest;
import com.jlopez11c.api.v1.communication.application.controller.response.FileTransferResponse;
import com.jlopez11c.api.v1.communication.application.service.dto.FileTransferDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.ArrayList;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        imports = {ArrayList.class}
)
public interface CommunicationControllerMapper {

    FileTransferDto mapRequestToDto(FileTransferUploadRequest request);
    FileTransferDto mapRequestToDto(FileTransferDownloadRequest request);

    FileTransferResponse mapDtoToResponse(FileTransferDto request);
}
