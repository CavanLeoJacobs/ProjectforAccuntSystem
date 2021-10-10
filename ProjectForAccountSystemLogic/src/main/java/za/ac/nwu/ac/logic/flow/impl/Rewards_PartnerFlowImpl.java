package za.ac.nwu.ac.logic.flow.impl;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;
import za.ac.nwu.ac.logic.flow.Rewards_PartnerFlow;
import za.ac.nwu.ac.translator.Rewards_PartnerTranslator;

import java.util.List;

public class Rewards_PartnerFlowImpl implements Rewards_PartnerFlow
{



    public final Rewards_PartnerTranslator rewards_PartnerTranslator;
    public Rewards_PartnerFlowImpl(Rewards_PartnerTranslator rewards_partnerTranslator) {
        rewards_PartnerTranslator = rewards_partnerTranslator;
    }

    @Override
    public List<Rewards_PartnerDto> getAllRewards_Partner() {
        return getAllRewards_Partner();
    }
}
