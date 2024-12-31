package com.jlopez11c.api.v1.communication.application.controller.response;

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
public class FileTransferResponse {

    private FileDetailResponse fileDetails;
    private Map<String, Object> metadata;
    private CommunicationDetailResponse communication;

}
