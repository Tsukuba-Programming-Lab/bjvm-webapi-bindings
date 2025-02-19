package dev.itsu.dom.html;

import org.w3c.dom.html.HTMLFormElement;

public class HTMLInputElement extends HTMLElement implements org.w3c.dom.html.HTMLInputElement {
    @Override
    public String getDefaultValue() {
        return "";
    }

    @Override
    public void setDefaultValue(String defaultValue) {

    }

    @Override
    public boolean getDefaultChecked() {
        return false;
    }

    @Override
    public void setDefaultChecked(boolean defaultChecked) {

    }

    @Override
    public HTMLFormElement getForm() {
        return null;
    }

    @Override
    public String getAccept() {
        return getAttribute("accept");
    }

    @Override
    public void setAccept(String accept) {
        setAttribute("accept", accept);
    }

    @Override
    public String getAccessKey() {
        return "";
    }

    @Override
    public void setAccessKey(String accessKey) {

    }

    @Override
    public String getAlign() {
        return getAttribute("align");
    }

    @Override
    public void setAlign(String align) {
        setAttribute("align", align);
    }

    @Override
    public String getAlt() {
        return getAttribute("alt");
    }

    @Override
    public void setAlt(String alt) {
        setAttribute("alt", alt);
    }

    @Override
    public boolean getChecked() {
        var attribute = getAttribute("checked");
        return attribute != null && attribute.equals("true");
    }

    @Override
    public void setChecked(boolean checked) {
        setAttribute("checked", checked ? "true" : "false");
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
    public int getMaxLength() {
        var attribute = getAttribute("maxlength");
        return attribute == null ? 0 : Integer.parseInt(attribute);
    }

    @Override
    public void setMaxLength(int maxLength) {
        setAttribute("maxlength", String.valueOf(maxLength));
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
    public boolean getReadOnly() {
        var attribute = getAttribute("readonly");
        return attribute != null && attribute.equals("true");
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        setAttribute("readonly", String.valueOf(readOnly));
    }

    @Override
    public String getSize() {
        return getAttribute("size");
    }

    @Override
    public void setSize(String size) {
        setAttribute("size", size);
    }

    @Override
    public String getSrc() {
        return getAttribute("src");
    }

    @Override
    public void setSrc(String src) {
        setAttribute("src", src);
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
    public String getUseMap() {
        return "";
    }

    @Override
    public void setUseMap(String useMap) {

    }

    private native String getValue0();

    @Override
    public String getValue() {
        return getValue0();
    }

    private native void setValue0(String value);

    @Override
    public void setValue(String value) {
        setValue0(value);
    }

    @Override
    public void blur() {

    }

    @Override
    public void focus() {

    }

    @Override
    public void select() {

    }

    @Override
    public void click() {

    }
}
