<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=, initial-scale=1.0" />
    <title>마이페이지</title>
    <link rel="stylesheet" href="../css/mypage.css" />
    <link rel="stylesheet" href="../reset.css" />
    <!-- 폰트어썸폴더 -->
<script src="https://kit.fontawesome.com/071562b1d0.js" crossorigin="anonymous"></script> 
    <!-- 구글 폰트-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Gowun+Batang&display=swap" rel="stylesheet">
  </head>
  
  <header id="header">
    <div id="Binggrae_font">
      <a href="/" id="KHTRAVEL">KHTRAVEL</a>
    </div>
  </header>  
  <!-- //style="overflow: hidden" -->
  <body  style="overflow-x: hidden; overflow-y:auto;" id="body">
    <div id="mainpage">
    <div id="image_container" style="margin-top: 20px;"><img src="../IMG/제목 없는 디자인.png" alt=""></div>
  </div><br>
    <div id="imgpage2">
    <label for="input-file" class="input-file"><i class="fa-solid fa-camera-retro"></i>&nbsp;이미지 추가</label>
    <br><br><br><br>
    <input type="file" accept="image/*" onchange="imgShow(event)" id="input-file" style="display: none;">
  </div>
  <details>
    <summary style="padding-left:55px; padding-right: 55px;"><span id="more"><h1><i class="fa-regular fa-calendar-check" id="red"></i>&nbsp;예약정보</h1></span></summary>
<!---------------------------------------------------------------------->
 
<br>
  <!------------------------------------------------------------------->
  <details >
    <summary><span id="more"> <h1><i class="fa-solid fa-user-gear" id="green"></i>&nbsp;회원정보 수정</h1></span></summary>
    <br>
    <details>
    <summary><span id="more"> <h1><i class="fa-regular fa-address-card" style="color: rgb(202, 169, 96);"></i>&nbsp;기본정보 변경</h1></span></summary>
    <div id="mainpage4">
      <section id="section4" class="sect">
        <div id="line">
        <h2>기본 정보 수정</h2>
      </div>
      <br><br>
        <div class="idid">
              <label for ="text">이름</label>
              <input type="text" id="name" name="name" class="name"required>
          </div>
          <div class="idid">
              <label for="phone">전화번호</label>
              <input type="text" id="phone" name="phone" class="name" required>
          </div>
        <!-- 이메일 현재 사용 안함  -->
        <!--   <div class="idid">
            <label for ="Email">이메일</label>
            <input type="text" id="email" name="email" class="name" required>
        </div><br><br> --> 
          <button type="submit" class="infobu">회원 정보 수정</button>
  </details>
  <details>
    <summary><span id="more"> <h1><i class="fa-solid fa-lock" style="color: #62865f;"></i>&nbsp;비밀번호 변경</h1></span></summary>
    <div id="mainpage4">
      <section id="section4" class="sect">
        <div id="line">
        <h2>비밀번호 변경</h2>
      </div>
      <br><br>
        <div class="idid">
              <label for ="password">비밀번호</label>
              <input type="password" id="password" name="password" class="name"required>
          </div>
          <div class="idid">
              <label for="password">변경할 비밀번호</label>
              <input type="password" id="pwdupdate" name="pwdupdate" class="name" required>
          </div>
          <div class="idid">
            <label for ="password">변경할 비밀번호 확인</label>
            <input type="password" id="pwdcheck" name="pwdcheck" class="name" required>
        </div>
          <button type="submit" class="infobu">회원 정보 수정</button>
  </div>
  </section>
  </details>
  <div style="width: 100%; height: 100px;"></div>
  </details>
  
    <script src="../js/마이페이지12.js"></script>
  </body>
</html>