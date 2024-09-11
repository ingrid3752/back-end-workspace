<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>굿즈</title>
    <link
      href="${pageContext.request.contextPath}/css/reset.css"
      rel="stylesheet"
    />
    <link
      href="${pageContext.request.contextPath}/css/goods.css"
      rel="stylesheet"
    />
    <style>
      label.menu {
        border: 5px solid rgba(117, 188, 255, 0.5);
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
          value="어디로?"
          onclick="history.go(-1)"
        />
      </div>
      <img src="img/굿즈로고-removebg-preview.png" alt="" />
    </div>
    <br />
    <label class="menu" for="menu">루브르박물관 굿즈샵</label>
    <input id="menu" type="checkbox" />
    <nav id="main_nav">
      <ul>
        <div>
          <a href="#"></a
          ><img src="img/굿즈소개.png" width="800" height="700" />
          <a href="#"></a><img src="img/굿즈1.png" width="600" height="700" />
        </div>
        <div>
          <a href="#"></a
          ><img src="img/루브르박물관굿즈샵.png" width="650" height="600" />
          <a href="#"></a
          ><img src="img/지상간이매대.png" width="750" height="600" />
        </div>

        <div id="img">
          <a href="#"></a><img src="img/굿즈2.png" width="400" height="600" />
          <a href="#"></a><img src="img/굿즈3.png" width="400" height="600" />
          <a href="#"></a
          ><img src="img/불가사리.png" width="600" height="600" />
        </div>
        <div id="img">
          <a href="#"></a><img src="img/굿즈4.png" width="368" height="400" />
          <a href="#"></a><img src="img/굿즈5.png" width="363" height="400" />
          <a href="#"></a><img src="img/굿즈6.png" width="663" height="400" />
        </div>
        <div id="img">
          <a href="#"></a><img src="img/굿즈7.png" width="368" height="500" />
          <a href="#"></a
          ><img src="img/머그컵과텀블러.png" width="363" height="500" />
          <a href="#"></a><img src="img/시계.png" width="663" height="500" />
        </div>
      </ul>
    </nav>
    <br />
    <div id="review-box">
      <div id="review">
        <li>루브르박물관 굿즈샵</li>
        <p>루브르박물관 지하 쇼핑몰에 위치한 공식 굿즈샵 입니다.</p>
        <p>
          루브르박물관 관람후 구경하기 좋은 위치입니다. 루브르 지하철역과도
          연결되어 있습니다.
        </p>
        <p>행사기간</p>
        <p>파리 올림픽</p>
        <p>2024. 7. 26 ~ 8. 11</p>
        <p>파리 패럴림픽</p>
        <p>2024. 8. 28 ~ 9. 8</p>
        <li>키링</li>
        <p>
          로고와 함께 Paris 2024가 쓰여있는 심플한 디자인으로 밋밋하지만 나름
          고급지게 생겼습니다.
        </p>
        <p>키링과 같은 로고가 박혀있는 지갑도 있습니다.</p>
        <p>
          마스코트인 프리주 얼굴이 들어간 캐리어 네임택은 앞면은 프리주의 귀여운
          표정이, 뒷면은 이름을 쓸 수 있는 란이 있어 캐리어에 달면 실용적으로
          쓰기 좋을 것 같습니다.
        </p>
        <li>옷, 모자</li>
        <p>디자인이 제법 다채롭게 구성 되어 있습니다.</p>
        <p>여름인 만큼 반팔 비중이 압도적으로 많습니다.</p>
        <p>
          대부분의 옷들에는 성화봉송 모양의 불 그림과, Paris 2024가
          적혀있습니다.
        </p>
        <p>심플 하면서도 포인트가 되게끔 디자인이 되어있습니다.</p>
        <p>실용성 좋은 상품들이 많아 트레이닝복으로도 사용할 수 있습니다.</p>
        <li>모자</li>
        <p>캡모자도 있고 베레모도 있습니다.</p>
        <p>캡모자는 France 국기 색을 담아 독특하고 귀여운 디자인입니다.</p>
        <p>
          그래도 프랑스하면 베레모가 생각나기도 하죠. 심플하면서 올림픽 성화
          마크가 있네요.
        </p>
        <li>프리주 인형</li>
        <p>
          대망의 프리주 Phryge 인형입니다. 이번 프랑스 올림픽의 마스코트인
          프리주 인형은 작은 사이즈, 중간 사이즈, 큰 사이즈 크기별로
          나와있습니다.
        </p>
        <p>프리주는 작은 프리기아 모자입니다.</p>
        <p>
          자유, 통합, 사람들의 위대하고 의미 있는 일들을 지지하는 능력을
          대표하는 강력한 상징이라고 합니다.
        </p>
        <p>
          프랑스 국기에 들어가 있는 색인 빨강, 하양, 파랑 3가지 색으로 짜였고,
          Paris 2024 금색 로고가 인형 가슴팍에 새겨져 있습니다.
        </p>
        <p>패럴림픽을 상징하는 의족을 착용하고 있는 프리주도 있습니다.</p>
        <li>머그컵, 텀블러, 시계</li>
        <p>
          가장 만만하면서 실용적인 기념품이기도 한 머그컵과 텀블러, 프리주가
          들어간 버전과 흰색 바탕에 공식 로고만 심플하게 적힌 버전의 머그컵 중
          고를 수 있습니다.
        </p>
        <p>아기자기하게 꾸며진 디자인의 손목시계도 있습니다.</p>
        <p>아이들이 좋아할 것 같은 디자인들입니다.</p>
        <p>사이즈도 키즈에 가까운 듯합니다.</p>
        <p>
          전 세계에서 가장 큰 박물관 중 하나인 루브르박물관을 구경할 겸 굿즈샵도
          한번 방문해보시길 바랍니다.
        </p>
        <br />
      </div>
    </div>
    <br /><br /><br /><br />
  </body>
</html>