package za.ac.nwu.ac.domain.dto;

import io.swagger.annotations.ApiModel;
@ApiModel(value="Discovery_Administrator",description="A DTO that represents the Discovery_Administrator")
public class Discovery_AdministratorDto
{
    private Long Administrator_EmployeeNumber;
    private String Administrator_Name;
    private String Administrator_Surname;


    public Discovery_AdministratorDto(Long Administrator_EmployeeNumber, String Administrator_Name, String Administrator_Surname)
    {
        this.Administrator_EmployeeNumber=Administrator_EmployeeNumber;
        this.Administrator_Name=Administrator_Name;
        this.Administrator_Surname=Administrator_Surname;
    }
    public Discovery_AdministratorDto(Discovery_AdministratorDto discovery_administratorDto)
    {
        this.setAdministrator_EmployeeNumber(discovery_administratorDto.getAdministrator_EmployeeNumber());
        this.setAdministrator_Name(discovery_administratorDto.getAdministrator_Name());
        this.setAdministrator_Surname(discovery_administratorDto.getAdministrator_Surname());
    }
    public Long getAdministrator_EmployeeNumber() {
        return Administrator_EmployeeNumber;
    }

    public void setAdministrator_EmployeeNumber(Long administrator_EmployeeNumber) {
        Administrator_EmployeeNumber = administrator_EmployeeNumber;
    }

    public String getAdministrator_Name() {
        return Administrator_Name;
    }

    public void setAdministrator_Name(String administrator_Name) {
        Administrator_Name = administrator_Name;
    }

    public String getAdministrator_Surname() {
        return Administrator_Surname;
    }

    public void setAdministrator_Surname(String administrator_Surname) {
        Administrator_Surname = administrator_Surname;
    }
}
