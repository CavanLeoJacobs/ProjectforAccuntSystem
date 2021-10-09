package za.ac.nwu.ac.logic.flow.impl;

import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.logic.flow.MemberFlow;

import za.ac.nwu.ac.translator.MemberTranslator;

import java.util.List;

public class MemberFlowImpl implements MemberFlow
{

    public final MemberTranslator memberTranslator;

    public MemberFlowImpl(MemberTranslator memberTranslator) {
        this.memberTranslator = memberTranslator;
    }

    @Override
    public List<MemberDto> getAllMember() {
        return memberTranslator.getAllMember();
    }
}