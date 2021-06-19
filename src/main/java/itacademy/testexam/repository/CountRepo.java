package itacademy.testexam.repository;

import itacademy.testexam.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRepo extends JpaRepository<Count,Long> {
}
