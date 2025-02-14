package dev.itsu.bjvm.apis.fetch.requestinit;

public enum Cache {

    DEFAULT("default"),
    NO_STORE("no-store"),
    RELOAD("reload"),
    NO_CACHE("no-cache"),
    FORCE_CACHE("force-cache"),
    ONLY_IF_CACHED("only-if-cached");

    private String value;

    Cache(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Cache fromValue(String value) {
        for (Cache type : values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }

}
