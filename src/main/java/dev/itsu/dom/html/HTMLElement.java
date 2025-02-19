package dev.itsu.dom.html;

import dev.itsu.dom.Element;

public class HTMLElement extends Element implements org.w3c.dom.html.HTMLElement {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getLang() {
        return "";
    }

    @Override
    public void setLang(String lang) {

    }

    @Override
    public String getDir() {
        return "";
    }

    @Override
    public void setDir(String dir) {

    }

    @Override
    public String getClassName() {
        return getAttribute("class");
    }

    @Override
    public void setClassName(String className) {
        setAttribute("class", className);
    }
}
