package dev.itsu.bjvm.apis.fetch.requestinit;

public enum Redirect {

    FOLLOW("follow"),
    ERROR("error"),
    MANUAL("manual");

    private String value;

    Redirect(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
