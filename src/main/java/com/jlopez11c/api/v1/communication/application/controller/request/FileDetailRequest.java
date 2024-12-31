package com.jlopez11c.api.v1.communication.application.controller.request;

import jakarta.validation.constraints.NotNull;
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
public class FileDetailRequest {

    @NotNull
    private String base64Content;
    @NotNull
    private String name;
    @Builder.Default
    private String extension = "pdf";
}
