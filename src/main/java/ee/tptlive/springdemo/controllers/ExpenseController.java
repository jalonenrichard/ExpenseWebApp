package ee.tptlive.springdemo.controllers;

import ee.tptlive.springdemo.models.Expense;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/expenses")
public class ExpenseController {

    @GetMapping
    public List<Expense> showAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        return expenses;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createNewExpense() {
    }

    @GetMapping("/{id}")
    public Expense showExpenseById(@PathVariable("id") long id) {
        return new Expense();
    }
}
