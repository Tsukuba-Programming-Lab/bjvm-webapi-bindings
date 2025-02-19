package dev.itsu.dom.html;

import org.w3c.dom.html.HTMLFormElement;

public class HTMLTextareaElement extends HTMLElement implements org.w3c.dom.html.HTMLTextAreaElement {
    @Override
    public String getDefaultValue() {
        return "";
    }

    @Override
    public void setDefaultValue(String defaultValue) {

    }

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
    public int getCols() {
        var attribute = getAttribute("cols");
        return attribute == null ? 20 : Integer.parseInt(attribute);
    }

    @Override
    public void setCols(int cols) {
        setAttribute("cols", String.valueOf(cols));
    }

    @Override
    public boolean getDisabled() {
        var attribute = getAttribute("disabled");
        return attribute != null && attribute.equals("true");
    }

    @Override
    public void setDisabled(boolean disabled) {
        setAttribute("disabled", String.valueOf(disabled));
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
    public int getRows() {
        var attribute = getAttribute("rows");
        return attribute == null ? 2 : Integer.parseInt(attribute);
    }

    @Override
    public void setRows(int rows) {
        setAttribute("rows", String.valueOf(rows));
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
}
