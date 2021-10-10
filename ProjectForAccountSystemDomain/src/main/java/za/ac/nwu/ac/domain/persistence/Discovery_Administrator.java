package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

public class Discovery_Administrator implements Serializable
{
    private static final long serialVersionUID = 6543207124269325991L;

    private Integer Administrator_EmployeeNumber;
    private String Administrator_Name;
    private String Administrator_Surname;
    private Set<Member> members;
    private Set<Rewards_Partner> rewards_partners;

    public Discovery_Administrator()
    {

    }
    public Discovery_Administrator(Integer Administrator_EmployeeNumber, String Administrator_Name, String Administrator_Surname)
    {
        this.Administrator_EmployeeNumber=Administrator_EmployeeNumber;
        this.Administrator_Name=Administrator_Name;
        this.Administrator_Surname=Administrator_Surname;
    }
    @Id
    @SequenceGenerator(name = "Discovery_Administrator",sequenceName ="Discovery_Administrator" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Discovery_Administrator")
    @Column(name = "Administrator_EmployeeNumber")
    public Integer  getAdministrator_EmployeeNumber()
    {
        return Administrator_EmployeeNumber;
    }
    @Column(name = "Administrator_Name")
    public String getAdministrator_Name()
    {
        return Administrator_Name;
    }
    @Column(name = "Administrator_Surname")
    public String getAdministrator_Surname()
    {
        return Administrator_Surname;
    }

}
