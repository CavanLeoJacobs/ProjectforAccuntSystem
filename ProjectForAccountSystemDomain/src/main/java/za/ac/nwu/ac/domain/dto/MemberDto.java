package za.ac.nwu.ac.domain.dto;

import io.swagger.annotations.ApiModel;
import za.ac.nwu.ac.domain.exception.ExceptionForDomainClasses;
import za.ac.nwu.ac.domain.persistence.Member;

import java.time.LocalDate;

@ApiModel(value="Member",description="A DTO that represents the Member")
public class MemberDto
{

    private Long Member_ID;
    private String Member_Name;
    private String Member_Surname;
    private Double Member_RewardsNumber;
    private Double Member_Miles;
    private Integer Member_Current_Plays;
    private LocalDate Member_JoinDate;

    public MemberDto()
    {

    }
    public MemberDto(Long Member_ID, String Member_Name, String Member_Surname, Double Member_RewardsNumber, Double Member_Miles, Integer Member_Current_Plays, LocalDate Member_JoinDate)
    {
        this.Member_ID=Member_ID;
        this.Member_Name=Member_Name;
        this.Member_Surname=Member_Surname;
        this.Member_RewardsNumber=Member_RewardsNumber;
        this.Member_Miles=Member_Miles;
        this.Member_Current_Plays=Member_Current_Plays;
        this.Member_JoinDate=Member_JoinDate;

    }

    public MemberDto(Member member)
    {
        this.setMember_ID(member.getMember_ID());
        this.setMember_Name(member.getMember_Name());
        this.setMember_Surname(member.getMember_Surname());
        this.setMember_RewardsNumber(member.getMember_RewardsNumber());
        this.setMember_Miles(member.getMember_Miles());
        this.setMember_Current_Plays(member.getMember_Current_Plays());
        this.setMember_JoinDate(member.getMember_JoinDate());
    }


    public Long getMember_ID() {
        return Member_ID;
    }

    public void setMember_ID(Long member_ID) {
        Member_ID = member_ID;
    }

    public String getMember_Name() {
        return Member_Name;
    }

    public void setMember_Name(String member_Name) {
        Member_Name = member_Name;
    }

    public String getMember_Surname() {
        return Member_Surname;
    }

    public void setMember_Surname(String member_Surname) {
        Member_Surname = member_Surname;
    }

    public Double getMember_RewardsNumber() {
        return Member_RewardsNumber;
    }

    public void setMember_RewardsNumber(Double member_RewardsNumber) {
        Member_RewardsNumber = member_RewardsNumber;
    }

    public Double getMember_Miles() {
        return Member_Miles;
    }

    public void setMember_Miles(Double member_Miles) {
        Member_Miles = member_Miles;
    }

    public Integer getMember_Current_Plays() {
        return Member_Current_Plays;
    }

    public void setMember_Current_Plays(Integer member_Current_Plays) {
        Member_Current_Plays = member_Current_Plays;
    }

    public LocalDate getMember_JoinDate() {
        return Member_JoinDate;
    }

    public void setMember_JoinDate(LocalDate member_JoinDate) {
        Member_JoinDate = member_JoinDate;
    }

}