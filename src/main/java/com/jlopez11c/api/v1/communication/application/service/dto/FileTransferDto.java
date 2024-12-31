package com.jlopez11c.api.v1.communication.application.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileTransferDto {

    private FileDetailDto fileDetails;
    private Map<String, Object> metadata;
    private CommunicationDetailDto communication;

}
