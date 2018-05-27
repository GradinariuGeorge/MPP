package mppcurse.curse.Repository;

import mppcurse.curse.Model.Operatori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoriRepository  extends JpaRepository<Operatori,Integer> {
}
