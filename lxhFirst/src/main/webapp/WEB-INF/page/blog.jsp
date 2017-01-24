<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<div class="tm-blog-img-container"></div>
<section class="tm-section">
	<div class="container-fluid">
		<div class="row tm-2-rows-sm-swap">
			<div class="col-xs-12 col-sm-12 col-md-4 col-lg-3 col-xl-3 tm-2-rows-sm-down-2">
				<h3 class="tm-gold-text">小游戏:</h3>
				<nav>
					<ul class="nav" id="gameUl">
						<li>
							<a href="game/html5-fruit-ninja/index.html" class="tm-text-link" target="gameIframe">水果忍者</a>
						</li>
						<li>
							<a href="game/html5-mario/index.html" class="tm-text-link" target="gameIframe">超级玛丽</a>
						</li>
						<li>
							<a href="game/jiaoben1144/index.html" class="tm-text-link" target="gameIframe">甩甩乐</a>
						</li>
					</ul>
				</nav>

			</div>
			<div class="row col-xs-12 col-sm-12 col-md-8 col-lg-9 col-xl-9 tm-2-rows-sm-down-1" id="gameContent" style="height:600px;">
				<iframe scrolling="no" name="gameIframe" height="95%" width="100%" src="game/html5-mario/index.html"> </iframe>
			</div>
		</div>
	</div>
</section>