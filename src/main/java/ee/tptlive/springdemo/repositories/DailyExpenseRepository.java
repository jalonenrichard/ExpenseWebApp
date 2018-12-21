package ee.tptlive.springdemo.repositories;

import ee.tptlive.springdemo.models.DailyExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyExpenseRepository extends JpaRepository<DailyExpense, Long> {
}
