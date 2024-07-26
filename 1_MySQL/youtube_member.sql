-- 회원
CREATE TABLE member(
	id VARCHAR(20) PRIMARY KEY,
    password VARCHAR(20),
    email VARCHAR(50),
    phone VARCHAR(13)
);

-- 채널 
CREATE TABLE channel(
	channel_code INT PRIMARY KEY AUTO_INCREMENT,
    channel_img VARCHAR(100),
    channel_name VARCHAR(50),
    id VARCHAR(20),
    FOREIGN KEY (id) REFERENCES member (id)
);
SELECT * FROM channel;

-- 동영상
CREATE TABLE video(
	video_code INT PRIMARY KEY AUTO_INCREMENT,
    video_url VARCHAR(100),
    video_img VARCHAR(100),
    video_title VARCHAR(80),
    video_count INT,
    video_date DATE DEFAULT (current_date),
    video_desc TEXT,
    channel_code INT,
    FOREIGN KEY (channel_code) REFERENCES channel(channel_code)
);
SELECT * FROM video;

-- 댓글
CREATE TABLE comment(
	comment_code INT PRIMARY KEY AUTO_INCREMENT,
    comment_text TEXT,
    comment_date DATE DEFAULT (current_date),
    id VARCHAR(20),
    video_code INT,
    parent_code INT,
    FOREIGN KEY (id) REFERENCES member (id),
    FOREIGN KEY (video_code) REFERENCES video(video_code)
);
SELECT * FROM comment;
-- 구독
CREATE TABLE subscribe(
	sub_code INT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(20),
    channel_code INT,
    FOREIGN KEY (id) REFERENCES member (id),
    FOREIGN KEY (channel_code) REFERENCES channel (channel_code)
);
SELECT * FROM subscribe;
-- 좋아요 
CREATE TABLE video_like(
	like_code INT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(20),
    video_code INT,
    FOREIGN KEY (id) REFERENCES member(id),
    FOREIGN KEY (video_code) REFERENCES video(video_code)
);
SELECT * FROM video_like;
SELECT * FROM employee;




















