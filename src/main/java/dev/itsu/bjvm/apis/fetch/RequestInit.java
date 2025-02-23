package dev.itsu.bjvm.apis.fetch;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Data
@Builder
public class RequestInit {

    private String body;

    @Builder.Default
    private String method = "GET";

    private HashMap<String, String> headers;

    @Builder.Default
    private boolean browsingTopics = false;

    @Builder.Default
    private String mode = "cors";

    @Builder.Default()
    private String credentials = "same-origin";

    private String cache;

    @Builder.Default
    private String redirect = "follow";

    @Builder.Default
    private String referrer = "about:client";

    private String referrerPolicy;

    @Builder.Default
    private String integrity = "";

    @Builder.Default
    private boolean keepalive = false;

    private String signal;

    @Builder.Default
    private String priority = "auto";

}

