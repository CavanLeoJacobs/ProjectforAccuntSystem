package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;
//import za.ac.nwu.ac.repo.persistence.Discovery_AdministratorRepository;
import za.ac.nwu.ac.repo.persistence.Rewards_PartnerRepository;
import za.ac.nwu.ac.translator.Rewards_PartnerTranslator;

import java.time.LocalDate;

@Component
public class Rewards_PartnerTranslatorImpl implements Rewards_PartnerTranslator {

    private final Rewards_PartnerRepository rewards_partnerRepository;
    @Autowired
    public  Rewards_PartnerTranslatorImpl(Rewards_PartnerRepository rewards_partnerRepository)
    {
        this.rewards_partnerRepository=rewards_partnerRepository;
    }

    @Override
    public Rewards_PartnerDto getPartner_Name(String Partner_Name)
    {
        return null;
    }
    @Override
    public Rewards_PartnerDto getTransaction_Amount(Double Transaction_Amount)
    {
        return null;
    }
    @Override
    public Rewards_PartnerDto getNumber_of_Miles_Used(Double Number_of_Miles_Used)
    {
        return null;
    }
    @Override
    public Rewards_PartnerDto getTransaction_Date(LocalDate Transaction_Date)
    {
        return null;
    }

}
