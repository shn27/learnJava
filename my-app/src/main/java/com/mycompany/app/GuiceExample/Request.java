package com.mycompany.app.GuiceExample;

import com.mycompany.app.GuiceExample.drawShape;
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
    public drawShape getRequest( ){
        return this.obj ;
    }
}

