package dev.itsu.dom.html;

public class HTMLImageElement extends HTMLElement implements org.w3c.dom.html.HTMLImageElement {
    @Override
    public String getLowSrc() {
        return "";
    }

    @Override
    public void setLowSrc(String lowSrc) {

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
    public String getBorder() {
        return getAttribute("border");
    }

    @Override
    public void setBorder(String border) {
        setAttribute("border", border);
    }

    @Override
    public String getHeight() {
        return getAttribute("height");
    }

    @Override
    public void setHeight(String height) {
        setAttribute("height", height);
    }

    @Override
    public String getHspace() {
        return "";
    }

    @Override
    public void setHspace(String hspace) {

    }

    @Override
    public boolean getIsMap() {
        return false;
    }

    @Override
    public void setIsMap(boolean isMap) {

    }

    @Override
    public String getLongDesc() {
        return "";
    }

    @Override
    public void setLongDesc(String longDesc) {

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
    public String getUseMap() {
        return "";
    }

    @Override
    public void setUseMap(String useMap) {

    }

    @Override
    public String getVspace() {
        return "";
    }

    @Override
    public void setVspace(String vspace) {

    }

    @Override
    public String getWidth() {
        return getAttribute("width");
    }

    @Override
    public void setWidth(String width) {
        setAttribute("width", width);
    }
}
