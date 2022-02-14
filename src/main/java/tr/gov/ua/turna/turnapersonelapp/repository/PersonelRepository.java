package tr.gov.ua.turna.turnapersonelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.gov.ua.turna.turnapersonelapp.entity.Personel;


public interface PersonelRepository extends JpaRepository<Personel, Long> {
}
