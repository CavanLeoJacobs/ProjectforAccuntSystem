package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

public class Member implements Serializable
{

    private static final long serialVersionUID = 5604864958111056329L;

    private Long Member_ID;
    private String Member_Name;
    private String Member_Surname;
    private Double Member_RewardsNumber;
    private Double Member_Miles;
    private Integer Member_Current_Plays;
    private LocalDate Member_JoinDate;
    public Member()
    {

    }

    public Member(Long Member_ID, String Member_Name, String Member_Surname, Double Member_RewardsNumber, Double Member_Miles, Integer Member_Current_Plays, LocalDate Member_JoinDate)
    {
        this.Member_ID=Member_ID;
        this.Member_Name=Member_Name;
        this.Member_Surname=Member_Surname;
        this.Member_RewardsNumber=Member_RewardsNumber;
        this.Member_Miles=Member_Miles;
        this.Member_Current_Plays=Member_Current_Plays;
        this.Member_JoinDate=Member_JoinDate;

    }
    @Id
    @SequenceGenerator(name = "Member",sequenceName ="Member" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Member")
    @Column(name = "Member_ID")
    public Long getMember_ID()
    {
        return Member_ID;
    }
    @Column(name = "Member_Name")
    public String getMember_Name()
    {
        return Member_Name;
    }
    @Column(name = "Member_Surname")
    public String getMember_Surname()
    {
        return Member_Surname;
    }
    @Column(name = "Member_RewardsNumber")
    public Double getMember_RewardsNumber()
    {
        return Member_RewardsNumber;
    }
    @Column(name = "Member_Miles")
    public Double getMember_Miles()
    {
        return Member_Miles;
    }
    @Column(name = "Member_Current_Plays")
    public Integer getMember_Current_Plays()
    {
        return Member_Current_Plays;
    }
    @Column(name = "Member_JoinDate")
    public LocalDate getMember_JoinDate()
    {
        return Member_JoinDate;
    }



    }
