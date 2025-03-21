package dev.itsu.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;

public class Element extends dev.itsu.dom.Node implements org.w3c.dom.Element {

    private native String getTagName0();

    @Override
    public String getTagName() {
        return getTagName0();
    }

    private native String getAttribute0(String name);

    @Override
    public String getAttribute(String name) {
        return getAttribute0(name);
    }

    private native void setAttribute0(String name, String value);

    @Override
    public void setAttribute(String name, String value) throws DOMException {
        setAttribute0(name, value);
    }

    private native void removeAttribute0(String name);

    @Override
    public void removeAttribute(String name) throws DOMException {
        removeAttribute0(name);
    }

    @Override
    public Attr getAttributeNode(String name) {
        return null;
    }

    @Override
    public Attr setAttributeNode(Attr newAttr) throws DOMException {
        return null;
    }

    @Override
    public Attr removeAttributeNode(Attr oldAttr) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagName(String name) {
        return null;
    }

    @Override
    public String getAttributeNS(String namespaceURI, String localName) throws DOMException {
        return "";
    }

    @Override
    public void setAttributeNS(String namespaceURI, String qualifiedName, String value) throws DOMException {

    }

    @Override
    public void removeAttributeNS(String namespaceURI, String localName) throws DOMException {

    }

    @Override
    public Attr getAttributeNodeNS(String namespaceURI, String localName) throws DOMException {
        return null;
    }

    @Override
    public Attr setAttributeNodeNS(Attr newAttr) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagNameNS(String namespaceURI, String localName) throws DOMException {
        return null;
    }

    @Override
    public boolean hasAttribute(String name) {
        return false;
    }

    @Override
    public boolean hasAttributeNS(String namespaceURI, String localName) throws DOMException {
        return false;
    }

    @Override
    public TypeInfo getSchemaTypeInfo() {
        return null;
    }

    @Override
    public void setIdAttribute(String name, boolean isId) throws DOMException {

    }

    @Override
    public void setIdAttributeNS(String namespaceURI, String localName, boolean isId) throws DOMException {

    }

    @Override
    public void setIdAttributeNode(Attr idAttr, boolean isId) throws DOMException {

    }
}
