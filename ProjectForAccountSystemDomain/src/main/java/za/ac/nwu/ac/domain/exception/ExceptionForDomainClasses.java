package za.ac.nwu.ac.domain.exception;


import za.ac.nwu.ac.domain.persistence.Discovery_Administrator;

public class ExceptionForDomainClasses //implements Serializable
{

       public void ExceptionHandler()
       {
               try
               {

                   System.out.println("Passed the test");



               }  catch (Exception error)
               {
                   System.out.println(error.getMessage());
                   System.out.println("Failed to pass this test");

               }
   }
}
