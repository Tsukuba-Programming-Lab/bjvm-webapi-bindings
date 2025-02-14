package dev.itsu.bjvm.apis.fetch.requestinit;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Data
@Builder
public class RequestInit {

    private String body;

    @Builder.Default
    private RequestMethod method = RequestMethod.GET;

    private HashMap<String, String> headers;

    @Builder.Default
    private boolean browsingTopics = false;

    @Builder.Default
    private Mode mode = Mode.CORS;

    @Builder.Default()
    private Credential credentials = Credential.SAME_ORIGIN;

    private Cache cache;

    @Builder.Default
    private Redirect redirect = Redirect.FOLLOW;

    @Builder.Default
    private String referrer = "about:client";

    private String referrerPolicy;

    @Builder.Default
    private String integrity = "";

    @Builder.Default
    private boolean keepalive = false;

    private String signal;

    @Builder.Default
    private Priority priority = Priority.AUTO;

}

