CREATE TABLE person(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20),
    age INT,
    addr VARCHAR(50)
);

SELECT * FROM person;

CREATE TABLE member(
	id VARCHAR(20) PRIMARY KEY,
    password VARCHAR(20),
    name VARCHAR(20)
    );

DROP TABLE member;
SELECT * FROM member;
SELECT * FROM employee;
