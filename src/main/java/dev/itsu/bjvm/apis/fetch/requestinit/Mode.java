package dev.itsu.bjvm.apis.fetch.requestinit;

public enum Mode {

    CORS("cors"),
    NO_CORS("no-cors"),
    SAME_ORIGIN("same-origin"),
    NAVIGATE("navigate");

    private String mode;

    Mode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

}
