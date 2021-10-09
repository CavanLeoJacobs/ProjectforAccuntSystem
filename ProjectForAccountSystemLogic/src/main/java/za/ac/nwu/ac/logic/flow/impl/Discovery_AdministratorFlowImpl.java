package za.ac.nwu.ac.logic.flow.impl;

import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;
import za.ac.nwu.ac.logic.flow.Discovery_AdministratorFlow;
import za.ac.nwu.ac.translator.Discovery_AdministratorTranslator;

import java.util.List;

public class Discovery_AdministratorFlowImpl implements Discovery_AdministratorFlow
{
    public final Discovery_AdministratorTranslator discovery_AdministratorTranslator;

    public Discovery_AdministratorFlowImpl(Discovery_AdministratorTranslator discovery_administratorTranslator) {
        discovery_AdministratorTranslator = discovery_administratorTranslator;
    }


    @Override
    public List<Discovery_AdministratorDto> getAllDiscovery_Administrator() {
        return discovery_AdministratorTranslator.getAllDiscovery_Administrator();
    }


}
