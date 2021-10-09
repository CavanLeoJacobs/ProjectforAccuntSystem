package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.repo.persistence.MemberRepository;
import za.ac.nwu.ac.translator.MemberTranslator;
@Component
public class MemberTranslatorImpl implements MemberTranslator
{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberTranslatorImpl(AccountTypeRepository accountTypeRepository)
    {
        //this.accountTypeRepository= accountTypeRepository;
    }


}
