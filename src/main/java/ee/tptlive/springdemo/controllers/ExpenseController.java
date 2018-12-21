package ee.tptlive.springdemo.controllers;

import ee.tptlive.springdemo.models.Expense;
import ee.tptlive.springdemo.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public List<Expense> showAllExpenses() {
        return expenseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createNewExpense(@RequestBody Expense expense) {
        expenseRepository.save(expense);
    }

    @GetMapping("/{id}")
    public Expense showExpenseById(@PathVariable("id") long id) {
        return expenseRepository.getOne(id);
    }
}
