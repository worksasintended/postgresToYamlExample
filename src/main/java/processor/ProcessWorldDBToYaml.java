package processor;

import domain.Country;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessWorldDBToYaml implements Processor {
    public void process(Exchange exchange) throws Exception {
        Object country = exchange.getIn().getBody();// do something I guess
        System.out.println(country);
    }
}
