DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
--   email VARCHAR(250) DEFAULT NULL
);

-- todo: to be maintained -> not valide right now