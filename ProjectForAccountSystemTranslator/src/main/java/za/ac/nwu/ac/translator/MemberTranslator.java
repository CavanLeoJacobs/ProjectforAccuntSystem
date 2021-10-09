package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.MemberDto;

import java.time.LocalDate;

public interface MemberTranslator
{

    MemberDto getMember_Name(String Member_Name);
    MemberDto getMember_Surname(String Member_Surname);
    MemberDto getMember_RewardsNumber(Double Member_RewardsNumber);
    MemberDto getMember_Miles(String Member_Miles);
    MemberDto getMember_Current_Plays(Integer Member_Current_Plays);
    MemberDto getMember_JoinDate(LocalDate Member_JoinDate);
}
