package com.mycompany.app.GuiceExample;

import com.mycompany.app.Annotation.Important;
import com.mycompany.app.GuiceExample.drawShape;
import jakarta.inject.Inject;

public class drawCircle implements drawShape {

    Integer edge ;
    String str ;
    @Inject
    public drawCircle( String str, @Important Integer edge ) {
        super();
        this.edge = edge ;
        this.str = str ;
    }


    public void draw() {
        System.out.println("This is a circle "  + str + " " + edge );

    }
}
