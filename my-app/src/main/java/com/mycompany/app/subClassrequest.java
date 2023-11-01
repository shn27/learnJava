package com.mycompany.app;

import jakarta.inject.Inject;

public class subClassrequest extends Request{

    @Inject
    public subClassrequest(drawShape obj) {
        super(obj);
    }

    @Override
    void makeRequest() {
        System.out.println("Sub Class Implemented");
        super.makeRequest();
    }
}
