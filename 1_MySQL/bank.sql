SELECT * FROM member;
INSERT INTO member(member_id, member_pwd, member_name) VALUES(?, ?, ?);
SELECT * FROM book;
DELETE FROM book WHERE bk_no = ?;
SELECT * FROM publisher;
SELECT * FROM rent;
SELECT * FROM member WHERE member_id = ? AND member_pwd = ?;
SELECT * FROM rent WHERE rent_book_no = 3;
SELECT * FROM book WHERE bk_title = ? AND bk_author = ?;
INSERT INTO book(bk_title, bk_author) VALUES (?, ?);

SELECT * FROM book JOIN publisher ON (bk_pub_no = pub_no);
