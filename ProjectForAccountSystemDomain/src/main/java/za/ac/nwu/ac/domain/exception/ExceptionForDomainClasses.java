package za.ac.nwu.ac.domain.exception;
//import za.ac.nwu.ac.domain.persistence.Member;

//import za.ac.nwu.ac.domain.dto.MemberDto;

import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.persistence.Discovery_Administrator;
import za.ac.nwu.ac.domain.persistence.Member;
import za.ac.nwu.ac.domain.service.GeneralResponse;

import java.io.Serializable;

public class ExceptionForDomainClasses //implements Serializable
{
   // GeneralResponse response =new GeneralResponse();
       public void ExceptionHandler()
       {
               try
               {
                 //  response.hashCode();

               }  catch (Exception error)
               {
                   System.out.println(error.getMessage());
                   System.out.println("Failed to pass this test");

               }
   }
}
