package za.ac.nwu.ac.web.sb.exception;



import za.ac.nwu.ac.web.sb.config.SwaggerConfiguration;

public class ExceptionForAllWar {


    public void ExceptionHandlerWar()
    {
       // SwaggerConfiguration swaggerConfiguration=new SwaggerConfiguration();


        try
        {

           // swaggerConfiguration.api();

        }  catch (Exception error) {

            System.out.println("Failed to pass this test");
            System.out.println(error.getMessage());
        }
    }
}
