CREATE TABLE
    expense
    (
		id BIGINT NOT NULL,
		expense_value NUMERIC,
		expense_category VARCHAR,
        expense_date DATETIME,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO expense (id, expense_value, expense_category, expense_date)
  VALUES (1, '1100', 'food', 4419619200000);
INSERT INTO expense (id, expense_value, expense_category, expense_date)
  VALUES (2, '2255', 'gas', 4419619200000);
INSERT INTO expense (id, expense_value, expense_category, expense_date)
  VALUES (3, '3300', 'other', 4419619200000);

INSERT INTO hibernate_sequence (next_val) VALUES (4);