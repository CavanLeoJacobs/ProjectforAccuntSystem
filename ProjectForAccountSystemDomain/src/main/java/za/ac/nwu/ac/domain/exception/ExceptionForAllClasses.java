package za.ac.nwu.ac.domain.exception;


import za.ac.nwu.ac.domain.persistence.Member;

public class ExceptionForAllClasses
{
    private String CorrectMember = "successful";
    private String ValidAnswer;
    Member foundMember = new Member();

       public String ExceptionMember()
       {
           try
           {
               ValidAnswer = foundMember.Member(CorrectMember);
               return ValidAnswer;
           }
           catch (Exception e)
           {

               return ("Member is not in the system");
           }
   }
}
