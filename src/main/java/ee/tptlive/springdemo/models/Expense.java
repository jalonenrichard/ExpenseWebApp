package ee.tptlive.springdemo.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Expense {
    private BigDecimal expense;
    private String category;
    private Date date;
}
