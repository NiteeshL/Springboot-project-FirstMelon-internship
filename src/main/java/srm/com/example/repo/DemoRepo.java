package srm.com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srm.com.example.dto.DemoDTO;

@Repository
public interface DemoRepo extends JpaRepository<DemoDTO, Long> {
    // JpaRepository provides basic CRUD methods like findAll() and save()
}
