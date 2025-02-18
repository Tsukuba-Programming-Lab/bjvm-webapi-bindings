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
        return false;
    }

    @Override
    public void setDisabled(boolean disabled) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getTabIndex() {
        return 0;
    }

    @Override
    public void setTabIndex(int tabIndex) {

    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String getValue() {
        return "";
    }

    @Override
    public void setValue(String value) {

    }
}
