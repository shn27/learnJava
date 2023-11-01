package com.mycompany.app;

import jakarta.inject.Inject;

public class Request {
    drawShape obj;

    @Inject
    public Request(drawShape obj) {
        this.obj = obj;
    }
    void makeRequest() {
        obj.draw();
    }
}

