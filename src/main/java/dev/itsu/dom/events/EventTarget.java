package dev.itsu.dom.events;

import org.w3c.dom.events.EventException;
import org.w3c.dom.events.EventListener;

public class EventTarget implements org.w3c.dom.events.EventTarget {

    /** This is for internal use only. */
    private String uuid;

    private native void addEventListener0(String type, EventListener listener, boolean useCapture);

    private native void removeEventListener0(String type, EventListener listener, boolean useCapture);

    private native boolean dispatchEvent0(org.w3c.dom.events.Event evt) throws EventException;

    public void addEventListener(String type, EventListener listener) {
        addEventListener(type, listener, false);
    }

    @Override
    public void addEventListener(String type, EventListener listener, boolean useCapture) {
        addEventListener0(type, listener, useCapture);
    }

    @Override
    public void removeEventListener(String type, EventListener listener, boolean useCapture) {
        removeEventListener0(type, listener, useCapture);
    }

    @Override
    public boolean dispatchEvent(org.w3c.dom.events.Event evt) throws EventException {
        return dispatchEvent0(evt);
    }

}
