package za.ac.nwu.ac.domain.dto;

import io.swagger.annotations.ApiModel;
import za.ac.nwu.ac.domain.persistence.Rewards_Partner;

import java.time.LocalDate;

@ApiModel(value="Rewards_Partner",description="A DTO that represents the Rewards_Partner")
public class Rewards_PartnerDto
{
    private Long Partner_CodeNumber;
    private String Partner_Name;
    private Double Transaction_Amount;
    private Double Number_of_Miles_Used;
    private LocalDate Transaction_Date;

    public Rewards_PartnerDto(Long Partner_CodeNumber,String Partner_Name,Double Transaction_Amount,Double Number_of_Miles_Used,LocalDate Transaction_Date)
    {
        this.Partner_CodeNumber=Partner_CodeNumber;
        this.Partner_Name=Partner_Name;
        this.Transaction_Amount=Transaction_Amount;
        this.Number_of_Miles_Used=Number_of_Miles_Used;
        this.Transaction_Date=Transaction_Date;
    }
    public Rewards_PartnerDto(Rewards_Partner rewards_partner)
    {
        this.setPartner_CodeNumber(rewards_partner.getPartner_CodeNumber());
        this.setPartner_Name(rewards_partner.getPartner_Name());
        this.setTransaction_Amount(rewards_partner.getTransaction_Amount());
        this.setNumber_of_Miles_Used(rewards_partner.getNumber_of_Miles_Used());
        this.setTransaction_Date(rewards_partner.getTransaction_Date());

    }

    public Long getPartner_CodeNumber() {
        return Partner_CodeNumber;
    }

    public void setPartner_CodeNumber(Long partner_CodeNumber) {
        Partner_CodeNumber = partner_CodeNumber;
    }

    public String getPartner_Name() {
        return Partner_Name;
    }

    public void setPartner_Name(String partner_Name) {
        Partner_Name = partner_Name;
    }

    public Double getTransaction_Amount() {
        return Transaction_Amount;
    }

    public void setTransaction_Amount(Double transaction_Amount) {
        Transaction_Amount = transaction_Amount;
    }

    public Double getNumber_of_Miles_Used() {
        return Number_of_Miles_Used;
    }

    public void setNumber_of_Miles_Used(Double number_of_Miles_Used) {
        Number_of_Miles_Used = number_of_Miles_Used;
    }

    public LocalDate getTransaction_Date() {
        return Transaction_Date;
    }

    public void setTransaction_Date(LocalDate transaction_Date) {
        Transaction_Date = transaction_Date;
    }
}
