package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member,Integer>
{

    @Query(value = "SELECT"
            +"*"
            +"FROM"
            +"Member"
            )
    Member getMember_ID();
    Member getMember_Name();
    Member getMember_Surname();
    Member getMember_RewardsNumber();
    Member getMember_Miles();
    Member getMember_Current_Plays();
    Member getMember_JoinDate();

}
