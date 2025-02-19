package dev.itsu.dom.html;

import org.w3c.dom.html.HTMLParagraphElement;

public class HTMLPElement extends HTMLElement implements HTMLParagraphElement {
    @Override
    public String getAlign() {
        return getAttribute("align");
    }

    @Override
    public void setAlign(String align) {
        setAttribute("align", align);
    }
}
