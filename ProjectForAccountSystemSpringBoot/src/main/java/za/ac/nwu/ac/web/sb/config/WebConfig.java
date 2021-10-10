package za.ac.nwu.ac.web.sb.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.logic.config.LogicConfig;
import za.ac.nwu.ac.web.sb.exception.ExceptionForAllWar;

@Import(LogicConfig.class)

@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.web.sb.controller",
        "za.ac.nwu.ac.web.sb.exception" })
public class WebConfig {

    LogicConfig Logic= new LogicConfig();
    public void ShowAllWebConfig()
    {
Logic.toString();

    }
}
