package dev.itsu.bjvm.apis.fetch;

import lombok.Builder;
import lombok.Data;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

@Data
@Builder
public class Response implements Cloneable {

    // TODO ReadableStream
    private ByteArrayInputStream body;

    private String _bodyText;

    private boolean bodyUsed;

    private HashMap<String, String> headers;

    private boolean ok;

    private boolean redirected;

    private int status;

    private String statusText;

    private String type;

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

    public BufferedInputStream bufferedInputStream() {
        return new BufferedInputStream(body);
    }

    public native String text();

    public native String json();

    public native <T> T json(Class<T> clazz);

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
