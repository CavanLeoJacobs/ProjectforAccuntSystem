package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;
import za.ac.nwu.ac.repo.persistence.Discovery_AdministratorRepository;
import za.ac.nwu.ac.translator.Discovery_AdministratorTranslator;



@Component
public class Discovery_AdministratorTranslatorImpl implements Discovery_AdministratorTranslator
{
    private final Discovery_AdministratorRepository discovery_administratorRepository;
    @Autowired
    public Discovery_AdministratorTranslatorImpl(Discovery_AdministratorRepository discovery_administratorRepository)
    {
        this.discovery_administratorRepository=discovery_administratorRepository;
    }

    @Override
    public Discovery_AdministratorDto getAdministrator_Name(String Administrator_Name)
    {
        return null;
    }
    @Override
    public Discovery_AdministratorDto getAdministrator_Surname(String Administrator_Surname)
    {
        return null;
    }



}
