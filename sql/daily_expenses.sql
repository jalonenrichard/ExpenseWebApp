CREATE TABLE
    daily_expenses
    (
		id BIGINT NOT NULL,
		daily_expense_value NUMERIC,
		daily_expense_date DATETIME,
		daily_expense_comment VARCHAR,
		daily_total_expenses VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO daily_expenses (id, daily_expense_value, daily_expense_date, daily_expense_comment, daily_total_expenses)
  VALUES (1, '5500', 4419619200000, 'comment1', 'list of the daily expenses' );
INSERT INTO daily_expenses (id, daily_expense_value, daily_expense_date, daily_expense_comment, daily_total_expenses)
  VALUES (2, '6066', 4419619200000, 'comment2', 'list of the daily expenses 2' );
INSERT INTO daily_expenses (id, daily_expense_value, daily_expense_date, daily_expense_comment, daily_total_expenses)
  VALUES (3, '7700', 4419619200000, 'comment3', 'list of the daily expenses 3' );

INSERT INTO hibernate_sequence (next_val) VALUES (4);