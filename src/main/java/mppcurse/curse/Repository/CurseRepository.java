package mppcurse.curse.Repository;

import mppcurse.curse.Model.Curse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurseRepository  extends JpaRepository<Curse,Integer> {
}
