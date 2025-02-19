package dev.itsu.dom.html;

public class HTMLDivElement extends HTMLElement implements org.w3c.dom.html.HTMLDivElement {
    @Override
    public String getAlign() {
        return getAttribute("align");
    }

    @Override
    public void setAlign(String align) {
        setAttribute("align", align);
    }
}
