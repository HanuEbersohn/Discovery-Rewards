package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.MEMBER_TABLE;

@Repository
public interface MemberRepository extends JpaRepository<MEMBER_TABLE, Long> {
}
