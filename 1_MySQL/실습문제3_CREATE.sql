DROP TABLE rent;
DROP TABLE member;
DROP TABLE book;
DROP TABLE publisher;
/*
	CREATE
    - 객체를 생성하는 구문 
    
    테이블 생성 
    CREATE TABLE 테이블명(
		컬럼명 자료형(크기),
        컬럼명 자료형(크기),
        ... 
    );
    
    * 자료형 
    1. 문자
		- CHAR / **VARCHAR** : 고정 및 가변 길이 문자, 반드시 크기 지정 
        - TEXT : 매우 긴 문자열을 저장하는데 사용 
	2. 숫자 
		- INT : 정수값 저장하는데 사용 
        - FLOAT / DOUBLE : 부동소수점 저장하는데 사용 
        - DECIMAL : 고정소수점 저장하는데 사용 
	3. 날짜 및 시간 
		- DATE : 날짜, 저장하는데 사용
        - TIME : 시간 저장하는데 사용 
        - DATETIME / TIMESTAMP : 날짜와 시간을 함께 저장 
	4. 불리언
		- BOOLEAN / BOOL : 참(True) 또는 거짓(False) 값을 저장하는데 사용 
	5. 이진 자료형 
		- BLOB : 이진 데이터를 저장하는데 사용. 이미지나 동영상과 같은 이진 파일 
        --> 실제로는 이미지나 동영상은 따로 관리함 (URL만 문자형으로 저장하는 편) 
*/

-- 실습 문제
-- 도서관리 프로그램을 만들기 위한 테이블 만들기

-- 1. 출판사들에 대한 데이터를 담기 위한 출판사 테이블(publisher) 
--    컬럼 : pub_no(출판사번호) -- 기본 키
--           pub_name(출판사명) -- NOT NULL
--           phone(전화번호)
-- 제약조건명 확인 
SELECT TABLE_SCHEMA, TABLE_NAME, CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM information_schema.TABLE_CONSTRAINTS
WHERE TABLE_SCHEMA = 'sample' AND TABLE_NAME = 'dept_copy';
SELECT * FROM publisher;
CREATE TABLE publisher(
	pub_no INT AUTO_INCREMENT PRIMARY KEY,
    pub_name VARCHAR(20) NOT NULL,
    phone VARCHAR(20)
);
-- 2. 도서들에 대한 데이터를 담기 위한 도서 테이블 (book)
--    컬럼 : bk_no (도서번호) -- 기본 키
--           bk_title (도서명) -- NOT NULL
--           bk_author(저자명) -- NOT NULL
--           bk_price(가격)
--           bk_pub_no(출판사 번호) -- 외래 키(publisher 테이블을 참조하도록)
--    조건 : 이때 참조하고 있는 부모 데이터 삭제 시 자식 데이터도 삭제 되도록 옵션 지정
CREATE TABLE book(
	bk_no INT AUTO_INCREMENT PRIMARY KEY,
    bk_title VARCHAR(30) NOT NULL,
    bk_author VARCHAR(20) NOT NULL,
    bk_price INT,
    bk_pub_no INT
);

-- 3. 회원에 대한 데이터를 담기 위한 회원 테이블 (member)
--    컬럼 : member_no(회원번호) -- 기본 키
--           member_id(아이디)   -- 중복 금지
--           member_pwd(비밀번호) -- NOT NULL
--           member_name(회원명) -- NOT NULL
--           gender(성별)        -- 'M' 또는 'F'로 입력되도록 제한
--           address(주소)       
--           phone(연락처)       
--           status(탈퇴여부)     -- 기본값 'N' / 'Y' 혹은 'N'만 입력되도록 제약조건
--           enroll_date(가입일)  -- 기본값 현재날짜
CREATE TABLE member(
	member_no INT AUTO_INCREMENT PRIMARY KEY,
    member_id VARCHAR(20) UNIQUE NOT NULL,
    member_pwd VARCHAR(20) NOT NULL,
    member_name VARCHAR(20) NOT NULL,
    gender VARCHAR(1)CHECK (gender IN ('M', 'F')),
    address VARCHAR(60),
    phone VARCHAR(20),
    status VARCHAR(1)CHECK (status IN ('Y', 'N')) DEFAULT 'N',
    enroll_date DATE DEFAULT (current_date())
);
-- 4. 도서를 대여한 회원에 대한 데이터를 담기 위한 대여 목록 테이블(rent)
--    컬럼 : rent_no(대여번호) -- 기본 키
--           rent_mem_no(대여 회원번호) -- 외래 키(member와 참조)
--           rent_book_no(대여 도서번호) -- 외래 키(book와 참조)
--           rent_date(대여일) -- 기본값 현재날짜
--    조건 : 이때 부모 데이터 삭제 시 NULL 값이 되도록 옵션 설정
CREATE TABLE rent(
	rent_no INT AUTO_INCREMENT PRIMARY KEY,
    member_no INT,
    bk_no INT,
    rent_date DATE DEFAULT (current_date())
);
-- ALTER로 FOREIGN KEY만 관리
SELECT * FROM rent;
SELECT * FROM publisher;
SELECT * FROM book;
SELECT * FROM member;

-- 5. 2번 도서를 대여한 회원의 이름, 아이디, 대여일, 반납 예정일(대여일 + 7일)을 조회하시오.
--  adddate(now(), interval 10 year)
SELECT member_name, member_id, rent_date, adddate(rent_date, interval 7 day)
FROM rent
JOIN member USING (member_no)
WHERE bk_no = '2';
-- 6. 회원번호가 1번인 회원이 대여한 도서들의 도서명, 출판사명, 대여일, 반납예정일을 조회하시오.
SELECT bk_title, pub_name, rent_date, adddate(rent_date, interval 7 day)
FROM rent
JOIN book USING (bk_no)
JOIN publisher USING (pub_no)
WHERE member_no = '1';
