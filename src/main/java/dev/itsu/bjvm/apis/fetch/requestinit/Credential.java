package dev.itsu.bjvm.apis.fetch.requestinit;

public enum Credential {

    OMIT("omit"),
    SAME_ORIGIN("same-origin"),
    INCLUDE("include");

    private String value;

    Credential(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
