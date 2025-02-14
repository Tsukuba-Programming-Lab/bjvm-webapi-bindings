package dev.itsu.bjvm.apis.fetch.requestinit;

public enum RequestMethod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS"),
    PATCH("PATCH");

    private String method;

    RequestMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

}
