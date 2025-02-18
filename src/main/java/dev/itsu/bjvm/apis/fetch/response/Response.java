package dev.itsu.bjvm.apis.fetch.response;

import lombok.Builder;
import lombok.Data;

import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

@Data
@Builder
public class Response implements Cloneable {

    // TODO ReadableStream
    private BufferedInputStream body;

    private boolean bodyUsed;

    private HashMap<String, String> headers;

    private boolean ok;

    private boolean redirected;

    private int status;

    private String statusText;

    private Type type;

    private String url;

    /**
     * TODO
     * @return null
     */
    public native ByteBuffer arrayBuffer();

    /**
     * TODO
     * @return null
     */
    public native String blob();

    /**
     * TODO
     * @return null
     */
    // public native FormData formData();

    /**
     * TODO
     * @return null
     */
    public native byte[] bytes();

    public native BufferedInputStream bufferedInputStream();

    public native String text();

    public native String json();

    @Override
    public Response clone() {
        return Response.builder()
                .bodyUsed(bodyUsed)
                .headers(new HashMap<>(headers))
                .ok(ok)
                .redirected(redirected)
                .status(status)
                .statusText(new String(statusText))
                .type(type)
                .url(new String(url))
                .build();
    }
}
