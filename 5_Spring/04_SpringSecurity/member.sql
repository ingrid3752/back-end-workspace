-- 회원
CREATE TABLE member(
	id VARCHAR(20) PRIMARY KEY,
    password VARCHAR(60),
    name VARCHAR(20),
    role VARCHAR(20)
);
SELECT * FROM member;
SELECT * FROM board;
CREATE TABLE board(
	no INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(20),
    content TEXT,
    date DATETIME DEFAULT CURRENT_TIMESTAMP,
    url VARCHAR(200)
);

DROP TABLE board;
DROP TABLE member;
SELECT * FROM movie;