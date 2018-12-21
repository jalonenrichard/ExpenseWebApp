package ee.tptlive.springdemo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DailyExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "daily_expense_value")
    private BigDecimal dailyTotalExpense;
    @Column(name = "daily_expense_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date expenseDate;
    @Column(name = "daily_expense_comment")
    private String comment;
    @Column(name = "daily_total_expenses")
    private String expenses;
}
