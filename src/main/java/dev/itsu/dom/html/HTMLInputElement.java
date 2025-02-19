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
        return "";
    }

    @Override
    public void setAccept(String accept) {

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
        return "";
    }

    @Override
    public void setAlign(String align) {

    }

    @Override
    public String getAlt() {
        return "";
    }

    @Override
    public void setAlt(String alt) {

    }

    @Override
    public boolean getChecked() {
        return false;
    }

    @Override
    public void setChecked(boolean checked) {

    }

    @Override
    public boolean getDisabled() {
        return false;
    }

    @Override
    public void setDisabled(boolean disabled) {

    }

    @Override
    public int getMaxLength() {
        return 0;
    }

    @Override
    public void setMaxLength(int maxLength) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public boolean getReadOnly() {
        return false;
    }

    @Override
    public void setReadOnly(boolean readOnly) {

    }

    @Override
    public String getSize() {
        return "";
    }

    @Override
    public void setSize(String size) {

    }

    @Override
    public String getSrc() {
        return "";
    }

    @Override
    public void setSrc(String src) {

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
