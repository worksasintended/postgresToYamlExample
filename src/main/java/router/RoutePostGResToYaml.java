package router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import processor.ProcessWorldDBToYaml;

@Component
public class RoutePostGResToYaml extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("started route");
        from("direct:start")
                .to("sql:SELECT * FROM country")
                .process(new ProcessWorldDBToYaml());

    }
}
