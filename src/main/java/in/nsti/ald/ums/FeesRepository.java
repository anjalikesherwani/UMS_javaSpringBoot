package in.nsti.ald.ums;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FeesRepository extends JpaRepository<Fees, Long> {
	
	@Query("SELECT f, l FROM Fees f JOIN Leave l ON f.rollno = l.rollno WHERE f.rollno = :rollno")
    List<Object[]> findFeesAndLeaveByRollno(@Param("rollno") String rollno);

}
