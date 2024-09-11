<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>양식</title>
    <link
      href="${pageContext.request.contextPath}/css/reset.css"
      rel="stylesheet"
    />
    <link
      href="${pageContext.request.contextPath}/css/france.css"
      rel="stylesheet"
    />
    <style>
      label.menu {
        border: 5px solid rgba(0, 0, 0, 0.5);
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
      <img src="img/양식점로고오-removebg-preview.png" alt="" />
    </div>
    <br />
    <label class="menu" for="menu">7eVin</label>
    <input id="menu" type="checkbox" />
    <nav id="main_nav">
      <ul>
        <div>
          <a href="#"></a
          ><img src="img/양식외부.png" width="800" height="500" />
          <a href="#"></a
          ><img src="img/양식내부.png" width="600" height="500" />
        </div>
        <div id="img">
          <a href="#"></a
          ><img src="img/양식메뉴판1.png" width="600" height="600" />
          <a href="#"></a
          ><img src="img/양식식전빵.png" width="800" height="600" />
        </div>
        <div>
          <a href="#"></a><img src="img/양식달팽이.png"650" height="500" />
          <a href="#"></a><img src="img/양식굴.png" width="750" height="500" />
        </div>

        <div id="img">
          <a href="#"></a
          ><img src="img/양식푸아그라.png" width="367" height="300" />
          <a href="#"></a
          ><img src="img/양식메인.png" width="362" height="300" />
          <a href="#"></a
          ><img src="img/양식오리.png" width="360" height="300" />
          <a href="#"></a
          ><img src="img/양식스테이크.png" width="299" height="300" />
        </div>
      </ul>
    </nav>
    <br />
    <div id="review-box">
      <div id="review">
        <li>에펠탑 근처 군사학교쪽에 위치해있는 '7eVin'입니다.</li>
        <p>
          영업시간 <br />
          런치 : 12:00 ~ 15:00 <br />
          디너 : 18:00 ~ 23:00 (일요일 휴무)
        </p>
        <li>전통 프랑스 양식</li>
        <p>
          구글 평점은 4.5점이며 세트 메뉴로 시키는것이 가성비가 좋은 편이다.
          <br />
          전통 프랑스 양식과 어울리는 와인도 곁들여 먹으시면 좋습니다. <br />
          와인 종류를 고르기 힘들다면 직원분의 추천을 받아보세요.
        </p>
        <li>대부분의 유럽 레스토랑들은 음식 간이 짠 편이다.</li>
        <p>주문시 소금 간을 조금 싱겁게 해달라고 말해두는 편이좋다. <br /></p>
        <li>서비스, 분위기, 맛</li>
        <p>
          직원들 모두 친절하고 체계적이다. <br />
          고급 레스토랑 분위기 그에 비해 가격은 비싼편은 아닙니다. <br />
          음식의 맛은 전체적으로 퀄리티가 높은편입니다
        </p>
        <br />
      </div>
    </div>
    <br /><br /><br /><br />
  </body>
</html>