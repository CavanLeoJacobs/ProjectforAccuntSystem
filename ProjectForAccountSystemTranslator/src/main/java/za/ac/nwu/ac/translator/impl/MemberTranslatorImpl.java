package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.repo.persistence.MemberRepository;
import za.ac.nwu.ac.translator.MemberTranslator;

import java.time.LocalDate;

@Component
public class MemberTranslatorImpl implements MemberTranslator {
    private final MemberRepository member_Repository;

    @Autowired
    public MemberTranslatorImpl(MemberRepository member_Repository) {
        this.member_Repository = member_Repository;
    }

    @Override
    public MemberDto getMember_Name(String Member_Name) {
        return null;
    }

    @Override
    public MemberDto getMember_Surname(String Member_Surname) {
        return null;
    }

    @Override
    public MemberDto getMember_RewardsNumber(Double Member_RewardsNumber) {
        return null;
    }
    @Override
    public MemberDto getMember_Miles(String Member_Miles) {
        return null;
    }
    @Override
    public MemberDto getMember_Current_Plays(Integer Member_Current_Plays) {
        return null;
    }
    @Override
    public MemberDto getMember_JoinDate(LocalDate Member_JoinDate)
    {
        return null;
    }

}

