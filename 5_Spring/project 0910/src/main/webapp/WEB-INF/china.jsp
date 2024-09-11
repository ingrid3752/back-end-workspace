<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>중식</title>
    <link
      href="${pageContext.request.contextPath}/css/reset.css"
      rel="stylesheet"
    />
    <link
      href="${pageContext.request.contextPath}/css/china.css"
      rel="stylesheet"
    />
    <style>
      label.menu {
        border: 5px solid rgba(253, 123, 123, 0.5);
        padding: 20px;
        line-height: 50px;
      }
      input#menu {
        display: none;
      }
      nav#main_nav {
        display: none;
        padding-left: 230px;
        padding-right: 220px;
      }
      input#menu:checked + nav#main_nav {
        display: block;
      }
    </style>
  </head>
  <body>
    <div id="logo">
      <div>
        <input
          type="button"
          id="button"
          class="button"
          value="뒤로가기"
          onclick="history.go(-1)"
        />
      </div>
      <img src="img/셰밍-removebg-preview.png" alt="" />
    </div>
    <br />
    <label class="menu" for="menu"> 중식 ChezMing</label>
    <input id="menu" type="checkbox" />
    <nav id="main_nav">
      <ul>
        <div>
          <a href="#"></a
          ><img src="img/중식당메뉴판.png" width="800" height="500" />
          <a href="#"></a><img src="img/중식당1.png" width="600" height="500" />
        </div>
        <div id="img">
          <a href="#"></a
          ><img src="img/중식당야외테라스.png" width="600" height="600" />
          <a href="#"></a
          ><img src="img/중식당내부.png" width="800" height="600" />
        </div>
        <div>
          <a href="#"></a
          ><img src="img/중식당2.png" width="650" height="500" />
          <a href="#"></a><img src="img/중식당3.png" width="750" height="500" />
        </div>
      </ul>
    </nav>
    <br />
    <div id="review-box">
      <div id="review">
        <li>에펠탑 근처 15구에 위치해있는 'ChezMing'입니다.</li>
        <p>
          영업시간 연중무휴 <br />
          런치 11:00 ~ 15:00 <br />
          디너 17:30 ~ 22:45
        </p>
        <li>합리적인 가격대의 요리를 즐길 수 있는 곳</li>
        <p>
          구글 지도 평점 4.1점이며 한국인의 입맛에 잘맞는다 <br />
          다양한 메뉴로 와인과 맥주가 잘어울리는 음식들
        </p>
        <li>에펠뷰 맛집 야외테라스</li>
        <p>
          에펠탑이 정말 잘보이는 야외테라스 <br />
          디너 타임에 야외 테라스 에서 식사를 하며 보는 에펠탑은 정말 아름답다.
        </p>
        <br />
      </div>
    </div>
    <br /><br /><br /><br />
  </body>
</html>