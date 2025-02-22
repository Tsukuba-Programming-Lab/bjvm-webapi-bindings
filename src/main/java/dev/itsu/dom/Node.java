package dev.itsu.dom;

import dev.itsu.dom.events.EventTarget;
import org.w3c.dom.*;
import org.w3c.dom.Document;

public class Node extends EventTarget implements org.w3c.dom.Node {

    @Override
    public String getNodeName() {
        return "";
    }

    @Override
    public String getNodeValue() throws DOMException {
        return "";
    }

    @Override
    public void setNodeValue(String nodeValue) throws DOMException {

    }

    @Override
    public short getNodeType() {
        return 0;
    }

    @Override
    public org.w3c.dom.Node getParentNode() {
        return null;
    }

    @Override
    public NodeList getChildNodes() {
        return null;
    }

    @Override
    public org.w3c.dom.Node getFirstChild() {
        return null;
    }

    @Override
    public org.w3c.dom.Node getLastChild() {
        return null;
    }

    @Override
    public org.w3c.dom.Node getPreviousSibling() {
        return null;
    }

    @Override
    public org.w3c.dom.Node getNextSibling() {
        return null;
    }

    @Override
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override
    public Document getOwnerDocument() {
        return null;
    }

    @Override
    public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) throws DOMException {
        return null;
    }

    @Override
    public org.w3c.dom.Node replaceChild(org.w3c.dom.Node newChild, org.w3c.dom.Node oldChild) throws DOMException {
        return null;
    }

    @Override
    public org.w3c.dom.Node removeChild(org.w3c.dom.Node oldChild) throws DOMException {
        return null;
    }

    private native org.w3c.dom.Node appendChild0(org.w3c.dom.Node newChild) throws DOMException;
    @Override
    public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws DOMException {
        return appendChild0(newChild);
    }

    @Override
    public boolean hasChildNodes() {
        return false;
    }

    @Override
    public org.w3c.dom.Node cloneNode(boolean deep) {
        return null;
    }

    @Override
    public void normalize() {

    }

    @Override
    public boolean isSupported(String feature, String version) {
        return false;
    }

    @Override
    public String getNamespaceURI() {
        return "";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public void setPrefix(String prefix) throws DOMException {

    }

    @Override
    public String getLocalName() {
        return "";
    }

    @Override
    public boolean hasAttributes() {
        return false;
    }

    @Override
    public String getBaseURI() {
        return "";
    }

    @Override
    public short compareDocumentPosition(org.w3c.dom.Node other) throws DOMException {
        return 0;
    }

    @Override
    public String getTextContent() throws DOMException {
        return "";
    }

    private native void setTextContent0(String textContent);

    @Override
    public void setTextContent(String textContent) throws DOMException {
        setTextContent0(textContent);
    }

    @Override
    public boolean isSameNode(org.w3c.dom.Node other) {
        return false;
    }

    @Override
    public String lookupPrefix(String namespaceURI) {
        return "";
    }

    @Override
    public boolean isDefaultNamespace(String namespaceURI) {
        return false;
    }

    @Override
    public String lookupNamespaceURI(String prefix) {
        return "";
    }

    @Override
    public boolean isEqualNode(org.w3c.dom.Node arg) {
        return false;
    }

    @Override
    public Object getFeature(String feature, String version) {
        return null;
    }

    @Override
    public Object setUserData(String key, Object data, UserDataHandler handler) {
        return null;
    }

    @Override
    public Object getUserData(String key) {
        return null;
    }
}