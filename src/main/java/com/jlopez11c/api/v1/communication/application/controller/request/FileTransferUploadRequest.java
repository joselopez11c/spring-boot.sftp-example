package com.jlopez11c.api.v1.communication.application.controller.request;

import jakarta.validation.constraints.NotNull;
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
public class FileTransferUploadRequest {

    @NotNull
    private FileDetailRequest fileDetails;
    private Map<String, Object> metadata;
    private CommunicationDetailRequest communication;

}
