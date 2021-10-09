package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.repo.persistence.Discovery_AdministratorRepository;
import za.ac.nwu.ac.repo.persistence.Rewards_PartnerRepository;
import za.ac.nwu.ac.translator.Rewards_PartnerTranslator;
@Component
public class Rewards_PartnerTranslatorImpl implements Rewards_PartnerTranslator {


    private final Rewards_PartnerRepository rewards_partnerRepository;
    @Autowired
    public  Rewards_PartnerTranslatorImpl(Rewards_PartnerRepository rewards_partnerRepository)
    {
        this.rewards_partnerRepository=rewards_partnerRepository;
    }


}
