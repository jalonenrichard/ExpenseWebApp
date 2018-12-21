package ee.tptlive.springdemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MonthlyExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "monthly_expense_month")
    private String month;
    @Column(name = "monthly_expense_value")
    private BigDecimal monthlyTotalExpense;
    @Column(name = "monthly_expense_comment")
    private String comment;
    @Column(name = "monthly_total_expenses")
    private String dailyExpenses;
}
