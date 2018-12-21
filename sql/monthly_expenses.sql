CREATE TABLE
    monthly_expenses
    (
		id BIGINT NOT NULL,
		monthly_expense_month VARCHAR,
		monthly_expense_value NUMERIC,
		monthly_expense_comment VARCHAR,
		monthly_total_expenses VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO monthly_expenses (id, monthly_expense_month, monthly_expense_value, monthly_expense_comment, monthly_total_expenses)
  VALUES (1, 'december', '111000', 'comment1', 'list of the daily expenses' );
INSERT INTO monthly_expenses (id, monthly_expense_month, monthly_expense_value, monthly_expense_comment, monthly_total_expenses)
  VALUES (2, 'january', '22000', 'comment2', 'list of the daily expenses 2' );
INSERT INTO monthly_expenses (id, monthly_expense_month, monthly_expense_value, monthly_expense_comment, monthly_total_expenses)
  VALUES (3, 'february', '322000', 'comment3', 'list of the daily expenses 3' );
INSERT INTO hibernate_sequence (next_val) VALUES (4);