package spark.examples.templateview;

import spark.ModelAndView;
import spark.TemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static spark.Spark.*;

public class FreeMarkerExampleNew
{

    public static void main( String args[]) {

        setTemplateEngine( new FreeMarkerTemplateEngine() );

        get( "/hello", ( request, response ) ->
          renderTemplate( "hello.ftl", arg( "message", "Hello FreeMarker World" ) )
        );

    }
}