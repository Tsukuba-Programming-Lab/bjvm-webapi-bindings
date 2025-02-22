package dev.itsu.dom;

import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Document extends dev.itsu.dom.Node implements org.w3c.dom.Document {
    @Override
    public DocumentType getDoctype() {
        return null;
    }

    @Override
    public DOMImplementation getImplementation() {
        return null;
    }

    @Override
    public Element getDocumentElement() {
        return null;
    }

    private native Element createElement0(String tagName);

    @Override
    public Element createElement(String tagName) throws DOMException {
        return createElement0(tagName);
    }

    @SuppressWarnings("unchecked")
    public <T extends Element> T createElementG(String tagName) throws DOMException {
        return (T) createElement0(tagName);
    }

    @Override
    public DocumentFragment createDocumentFragment() {
        return null;
    }

    @Override
    public Text createTextNode(String data) {
        return null;
    }

    @Override
    public Comment createComment(String data) {
        return null;
    }

    @Override
    public CDATASection createCDATASection(String data) throws DOMException {
        return null;
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String target, String data) throws DOMException {
        return null;
    }

    @Override
    public Attr createAttribute(String name) throws DOMException {
        return null;
    }

    @Override
    public EntityReference createEntityReference(String name) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagName(String tagname) {
        return null;
    }

    @Override
    public Node importNode(Node importedNode, boolean deep) throws DOMException {
        return null;
    }

    @Override
    public Element createElementNS(String namespaceURI, String qualifiedName) throws DOMException {
        return null;
    }

    @Override
    public Attr createAttributeNS(String namespaceURI, String qualifiedName) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagNameNS(String namespaceURI, String localName) {
        return null;
    }

    private native <T extends Element> T getElementById0(String elementId);

    @Override
    public Element getElementById(String elementId) {
        return getElementById0(elementId);
    }

    @SuppressWarnings("unchecked")
    public <T extends Element> T getElementByIdG(String elementId) {
        return (T) getElementById0(elementId);
    }

    @Override
    public String getInputEncoding() {
        return "";
    }

    @Override
    public String getXmlEncoding() {
        return "";
    }

    @Override
    public boolean getXmlStandalone() {
        return false;
    }

    @Override
    public void setXmlStandalone(boolean xmlStandalone) throws DOMException {

    }

    @Override
    public String getXmlVersion() {
        return "";
    }

    @Override
    public void setXmlVersion(String xmlVersion) throws DOMException {

    }

    @Override
    public boolean getStrictErrorChecking() {
        return false;
    }

    @Override
    public void setStrictErrorChecking(boolean strictErrorChecking) {

    }

    @Override
    public String getDocumentURI() {
        return "";
    }

    @Override
    public void setDocumentURI(String documentURI) {

    }

    @Override
    public Node adoptNode(Node source) throws DOMException {
        return null;
    }

    @Override
    public DOMConfiguration getDomConfig() {
        return null;
    }

    @Override
    public void normalizeDocument() {

    }

    @Override
    public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException {
        return null;
    }
}