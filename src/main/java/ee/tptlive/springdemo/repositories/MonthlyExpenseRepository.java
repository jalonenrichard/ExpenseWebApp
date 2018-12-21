package ee.tptlive.springdemo.repositories;

import ee.tptlive.springdemo.models.MonthlyExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyExpenseRepository extends JpaRepository<MonthlyExpense, Long> {
}
