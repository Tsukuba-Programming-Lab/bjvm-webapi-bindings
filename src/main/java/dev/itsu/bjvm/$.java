package dev.itsu.bjvm;

import dev.itsu.bjvm.apis.fetch.requestinit.RequestInit;
import dev.itsu.bjvm.apis.fetch.response.Response;
import org.w3c.dom.Document;

/**
 * Wrapper of Window object in Web API
 */
public class $ {

    /** Initialized by bJVM */
    public static Document document;

    // Window APIs

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">mdn web docs</a>
     */
    public static native void alert();

    public static native void alert(String message);

    public static native String atob(String encodedData);

    public static native void blur();

    public static native String btoa(String data);

    public static native void cancelAnimationFrame(String requestID);

    /**
     * TODO
     */
    public static native void cancelIdleCallback(Object handle);

    public static native void cleanInterval(String intervalID);

    public static native void clearTimeout(String timeoutID);

    public static native void close();

    public static native boolean confirm(String message);

    // Fetch APIs
    public static native Response fetch(String url);

    public static native Response fetch(String url, RequestInit options);

//    public static native void fetch(Request url);
//
//    public static native void fetch(Request url, RequestInit options);

}
