package dev.itsu.bjvm.apis.fetch.requestinit;

public enum Priority {

    HIGH("high"),
    LOW("low"),
    AUTO("auto");

    private String value;

    Priority(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
