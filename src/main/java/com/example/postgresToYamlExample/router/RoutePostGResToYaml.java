package com.example.postgresToYamlExample.router;

import com.example.postgresToYamlExample.processor.ProcessWorldDBToYaml;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RoutePostGResToYaml extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:start")
                .to("sql:select * from country;")
                .process(new ProcessWorldDBToYaml());

    }
}
