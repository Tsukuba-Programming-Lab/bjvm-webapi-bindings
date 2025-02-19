package dev.itsu.dom.html;

import org.w3c.dom.html.HTMLFormElement;

public class HTMLButtonElement extends HTMLElement implements org.w3c.dom.html.HTMLButtonElement {
    @Override
    public HTMLFormElement getForm() {
        return null;
    }

    @Override
    public String getAccessKey() {
        return "";
    }

    @Override
    public void setAccessKey(String accessKey) {

    }

    @Override
    public boolean getDisabled() {
        var attribute = getAttribute("disabled");
        return attribute != null && attribute.equals("true");
    }

    @Override
    public void setDisabled(boolean disabled) {
        setAttribute("disabled", disabled ? "true" : "false");
    }

    @Override
    public String getName() {
        return getAttribute("name");
    }

    @Override
    public void setName(String name) {
        setAttribute("name", name);
    }

    @Override
    public int getTabIndex() {
        var attribute = getAttribute("tabindex");
        return attribute == null ? 0 : Integer.parseInt(attribute);
    }

    @Override
    public void setTabIndex(int tabIndex) {
        setAttribute("tabindex", String.valueOf(tabIndex));
    }

    @Override
    public String getType() {
        return getAttribute("type");
    }

    @Override
    public String getValue() {
        return getAttribute("value");
    }

    @Override
    public void setValue(String value) {
        setAttribute("value", value);
    }
}
