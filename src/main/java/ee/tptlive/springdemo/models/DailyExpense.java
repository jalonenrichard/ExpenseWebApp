package ee.tptlive.springdemo.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class DailyExpense {
    private Date expenseDate;
    private BigDecimal dailyTotalExpense;
    private String comment;
    private List<Expense> expenses;
}
