package com.jlopez11c.api.v1.communication.application.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDetailResponse {

    private String base64Content;
    private String name;
    private String extension;
}
