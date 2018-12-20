package ee.tptlive.springdemo.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class MonthlyExpense {
    private String month;
    private BigDecimal monthlyTotalExpense;
    private String comment;
    private List<DailyExpense> dailyExpenses;
}
