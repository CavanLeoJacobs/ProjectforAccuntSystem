package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.Discovery_Administrator;

@Repository
public interface Discovery_AdministratorRepository extends JpaRepository<Discovery_Administrator,Long>
{
    @Query(value = "SELECT"
            +"*"
            +"FROM"
            +"Discovery_Administrator")

    Discovery_Administrator getAdministrator_EmployeeNumber();
    Discovery_Administrator getAdministrator_Name();
    Discovery_Administrator getAdministrator_Surname();


}
