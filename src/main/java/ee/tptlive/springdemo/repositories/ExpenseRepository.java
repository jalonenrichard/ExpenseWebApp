package ee.tptlive.springdemo.repositories;

import ee.tptlive.springdemo.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
