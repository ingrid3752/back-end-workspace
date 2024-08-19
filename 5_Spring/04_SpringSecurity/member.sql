-- 회원
CREATE TABLE member(
	id VARCHAR(20) PRIMARY KEY,
    password VARCHAR(60),
    name VARCHAR(20),
    role VARCHAR(20)
);
SELECT * FROM member;
CREATE TABLE board(
	no INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    content VARCHAR(100),
    url VARCHAR(200)
);
SELECT * FROM board 
-- LIMIT 0, 10; -- 첫 번째 페이지 (page=1)
LIMIT 0, 5; -- 5 * 0 = 0 / 10 * 0 = 0
SELECT * FROM board
-- LIMIT 10, 10; -- 두 번째 페이지 (page=2)
LIMIT 5, 5; -- 5 * 1 = 5 / 10 * 1 = 10

SELECT * FROM board
-- LIMIT 20, 10; -- 세 번째 페이지 (page=3)
LIMIT 10, 5; -- 5 * 2 = 10 / 10 * 2 = 20

INSERT INTO board(title, content) VALUES('테스트','테스트 정보입니다');

DROP TABLE board;
DROP TABLE member;