package dev.itsu.bjvm.apis.fetch.response;

public enum Type {

    BASIC("basic"),
    CORS("cors"),
    ERROR("error"),
    OPAQUE("opaque");

    private String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}