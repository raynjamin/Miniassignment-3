package com.theironyard.clt;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Spark.get("/", (request, response) -> {
            HashMap<String, String> model = new HashMap<>();
            model.put("content", "derp");
            return new ModelAndView(model, "index.html");
        }, new MustacheTemplateEngine());
    }
}
