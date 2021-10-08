package za.ac.nwu.ac.domain.persistence;


import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.exception.ExceptionForAllClasses;
import za.ac.nwu.ac.domain.service.GeneralResponse;


import java.io.Serializable;

public class Member implements Serializable
{
    private static final long serialVersionUID = -8824599160025875363L;
    private String ExceptionMember_message;
    ExceptionForAllClasses ExceptionHandler= new ExceptionForAllClasses();
    GeneralResponse responses_from_system=new GeneralResponse();
    MemberDto memDto= new MemberDto();

    public Member()
    {

    }
    public String Member(String ExceptionMember_message)
    {
        ExceptionHandler.ExceptionMember();
        if(ExceptionHandler.ExceptionMember().equals("successful"))
        {

            responses_from_system.Member();
           // return ;

        }
        else
        {
            return ExceptionHandler.ExceptionMember();
        }
        return null;
    }




}