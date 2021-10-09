package za.ac.nwu.ac.domain.exception;
//import za.ac.nwu.ac.domain.persistence.Member;

//import za.ac.nwu.ac.domain.dto.MemberDto;

import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;
import za.ac.nwu.ac.domain.persistence.Discovery_Administrator;
import za.ac.nwu.ac.domain.persistence.Member;
import za.ac.nwu.ac.domain.service.GeneralResponse;

import java.io.Serializable;

public class ExceptionForDomainClasses //implements Serializable
{
    Discovery_AdministratorDto responseD =new Discovery_AdministratorDto();
    MemberDto responseM =new MemberDto ();
    Rewards_PartnerDto responseR =new Rewards_PartnerDto();
       public void ExceptionHandler()
       {
               try
               {
                 //  response.hashCode();


                   responseD.setAdministrator_EmployeeNumber(97);


               }  catch (Exception error)
               {
                   System.out.println(error.getMessage());
                   System.out.println("Failed to pass this test");

               }
   }
}
