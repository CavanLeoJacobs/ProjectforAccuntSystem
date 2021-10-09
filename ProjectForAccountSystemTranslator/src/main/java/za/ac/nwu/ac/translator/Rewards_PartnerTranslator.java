package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;

import java.time.LocalDate;
import java.util.List;

public interface Rewards_PartnerTranslator
{

    Rewards_PartnerDto getPartner_Name(String Partner_Name);
    Rewards_PartnerDto getTransaction_Amount(Double Transaction_Amount);
    Rewards_PartnerDto getNumber_of_Miles_Used(Double Number_of_Miles_Used);
    Rewards_PartnerDto getTransaction_Date(LocalDate Transaction_Date);

   // List<Rewards_PartnerDto> getAllRewards_Partner();
}
