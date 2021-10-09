package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.Rewards_Partner;

@Repository
public interface Rewards_PartnerRepository extends JpaRepository<Rewards_Partner,Long>
{
    @Query(value = "SELECT"
            +"*"
            +"FROM"
            +"Rewards_Partner")
    Rewards_Partner getPartner_CodeNumber();
    Rewards_Partner getPartner_Name();
    Rewards_Partner getTransaction_Amount();
    Rewards_Partner getNumber_of_Miles_Used();
    Rewards_Partner getTransaction_Date();
}
