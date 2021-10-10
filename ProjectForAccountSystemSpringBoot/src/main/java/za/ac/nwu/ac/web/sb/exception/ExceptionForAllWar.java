package za.ac.nwu.ac.web.sb.exception;



import za.ac.nwu.ac.web.sb.config.SwaggerConfiguration;
import za.ac.nwu.ac.web.sb.config.WebConfig;

public class ExceptionForAllWar {


    public void ExceptionHandlerWar()
    {
        WebConfig classes = new WebConfig();
        try
        {
            classes.ShowAllWebConfig();



        }  catch (Exception error) {

            System.out.println("Failed to pass this test");
            System.out.println(error.getMessage());
        }
    }
}
