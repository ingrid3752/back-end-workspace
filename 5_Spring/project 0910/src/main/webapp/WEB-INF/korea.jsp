<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>한식</title>
    <link
      href="${pageContext.request.contextPath}/css/reset.css"
      rel="stylesheet"
    />
    <link
      href="${pageContext.request.contextPath}/css/korea.css"
      rel="stylesheet"
    />
    <style>
      label.menu {
        border: 5px solid rgba(255, 151, 109, 0.5);
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
      <img src="img/다래로고-removebg-preview.png" alt="" />
    </div>
    <br />
    <label class="menu" for="menu">한식 DARAI</label>
    <input id="menu" type="checkbox" />
    <nav id="main_nav">
      <ul>
        <div>
          <a href="#"></a><img src="img/다래.png" width="800" height="500" />
          <a href="#"></a
          ><img src="img/다래배경.png" width="600" height="500" />
        </div>
        <div>
          <a href="#"></a><img src="img/다래8.png" width="650" height="500" />
          <a href="#"></a><img src="img/다래2.png" width="750" height="500" />
        </div>

        <div id="img">
          <a href="#"></a><img src="img/다래3.png" width="700" height="300" />
          <a href="#"></a><img src="img/다래4.png" width="700" height="300" />
        </div>
        <div id="img">
          <a href="#"></a><img src="img/다래5.png" width="368" height="300" />
          <a href="#"></a><img src="img/다래7.png" width="363" height="300" />
          <a href="#"></a><img src="img/다래6.png" width="663" height="300" />
        </div>
      </ul>
    </nav>
    <br />
    <div id="review-box">
      <div id="review">
        <li>에펠탑 근처 15구에 위치해있는 '다래'입니다.</li>

        <p>
          영업시간 <br />
          런치 : 12:00 ~ 15:00 <br />
          디너 : 18:00 ~ 23:00 (일요일 휴무)
        </p>

        <li>합리적인 가격대의 요리를 즐길 수 있는 곳</li>
        <p>
          단품에 1유로만 추가하시면 전식(만두+튀김+김밥+김치전 약간)

          <br />
          ex.세트1, 단품2+전식
        </p>
        <br />
        <li>한국인이 운영하는 한식당</li>
        <p>
          여기는 한국인 사장님께서 직접 운영하시는 곳인데 현지인들 사이에서도
          인기가 좋으며<br />
          구글 지도 평점 4.5점이며 음식의 양또한 상당히 많다고합니다.
        </p>
        <br />
        <li>다양한 한식 메뉴와 정갈한 밑반찬 제공</li>
        <p>
          메뉴 종류가 다양하며 메인 요리류뿐만 아니라 전채요리 반찬 국 찌개 등등
          선택 폭또한 넓습니다.
        </p>
        <br />
        <li>친절한 서비스는 기본</li>
        <p>직원분들 모두다 최고의 서비스를 제공합니다.</p>
        <br />
        <li>에펠탑 근처에 위치해 접근성이 좋다</li>
        <p>
          식사후 에펠탑 관광을 할수있고, 역 근처라 식사후 지하철을 이용해
          숙소에가기도 편리합니다. <br />
          Dupleix 역에서 도보 5분 거리에 있고, 식당에서 에펠탑 까지의 거리는
          도보20분 정도입니다.
        </p>

        <li>여행 중 한식 생각날 때 가면 좋은 파리 한식당</li>
        <p>
          매일 오후 12시부터 오후11시 까지 운영한다고 하니 시간 맞춰 한번
          다녀오시는 것을 추천합니다. <br />
          디너 타임에는 웨이팅이 있을수도 있으니 참고하시길 바랍니다.
        </p>
        <br />
      </div>
    </div>
    <br /><br /><br /><br />
  </body>
</html>