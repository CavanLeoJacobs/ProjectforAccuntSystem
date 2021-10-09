package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

public class Rewards_Partner implements Serializable {

    private static final long serialVersionUID = 208497613881713636L;

    private Integer  Partner_CodeNumber;
    private String Partner_Name;
    private Double Transaction_Amount;
    private Double Number_of_Miles_Used;
    private LocalDate Transaction_Date;
    private Set<Member> members;
    private Set<Discovery_Administrator> discovery_administrators;



    public Rewards_Partner()
    {

    }
    public Rewards_Partner(Integer  Partner_CodeNumber,String Partner_Name,Double Transaction_Amount,Double Number_of_Miles_Used,LocalDate Transaction_Date)
    {
        this.Partner_CodeNumber=Partner_CodeNumber;
        this.Partner_Name=Partner_Name;
        this.Transaction_Amount=Transaction_Amount;
        this.Number_of_Miles_Used=Number_of_Miles_Used;
        this.Transaction_Date=Transaction_Date;
    }

    @Id
    @SequenceGenerator(name = "Rewards_Partner",sequenceName ="Rewards_Partner" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Rewards_Partner")
    @Column(name = "Partner_CodeNumber")
    public Integer getPartner_CodeNumber()
    {
        return Partner_CodeNumber;
    }
    @Column(name = "Partner_Name")
    public String getPartner_Name()
    {
        return Partner_Name;
    }
    @Column(name = "Transaction_Amount")
    public Double getTransaction_Amount()
    {
        return Transaction_Amount;
    }
    @Column(name = "Number_of_Miles_Used")
    public Double getNumber_of_Miles_Used()
    {
        return Number_of_Miles_Used;
    }
    @Column(name = "Transaction_Date")
    public LocalDate getTransaction_Date()
    {
        return Transaction_Date;
    }
}
