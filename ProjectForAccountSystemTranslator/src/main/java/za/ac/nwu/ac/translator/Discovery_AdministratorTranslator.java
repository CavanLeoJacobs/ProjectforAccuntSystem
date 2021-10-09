package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;


public interface Discovery_AdministratorTranslator
{

   // Discovery_AdministratorDto getAdministrator_EmployeeNumber(String Partner_Name);
    Discovery_AdministratorDto getAdministrator_Name(String Administrator_Name);
    Discovery_AdministratorDto getAdministrator_Surname(String Administrator_Surname);



}
