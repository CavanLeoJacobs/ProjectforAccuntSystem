package za.ac.nwu.ac.domain.exception;
//import za.ac.nwu.ac.domain.persistence.Member;

//import za.ac.nwu.ac.domain.dto.MemberDto;

import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.persistence.Member;

import java.io.Serializable;

public class ExceptionForDomainClasses //implements Serializable
{
  //  private static final long serialVersionUID = 7135135098889303298L;
    MemberDto CorrectDomain = new MemberDto();
    Member Correctper = new Member();

       public void ExceptionHandler()
       {
               try
               {
                   //CorrectDomain.MemberDto(Correctper);

               }  catch (Exception error)
               {
                   System.out.println(error.getMessage());
                   System.out.println("Failed to pass this test");

               }
   }
}
