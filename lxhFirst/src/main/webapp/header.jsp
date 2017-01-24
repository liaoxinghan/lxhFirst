<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<div class="tm-header">
	<div class="container-fluid">
		<div class="tm-header-inner">
			<a href="javascript:;" class="navbar-brand tm-site-name">Dream</a>
			<!-- navbar -->
			<nav class="navbar tm-main-nav">
				<button class="navbar-toggler hidden-md-up" type="button" data-toggle="collapse" data-target="#tmNavbar">&#9776;</button>
				<div class="collapse navbar-toggleable-sm" id="tmNavbar">
					<ul class="nav navbar-nav">
						<li class="nav-item active" id="index">
							<a href="javascript:;" class="nav-link">主页</a>
						</li>
						<li class="nav-item" id="about">
							<a href="javascript:;" class="nav-link">关于</a>
						</li>
						<li class="nav-item" id="blog">
							<a href="javascript:;" class="nav-link">游戏</a>
						</li>
						<li class="nav-item" id="contact">
							<a href="javascript:;" class="nav-link">联系</a>
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function() {
		$("li.nav-item").bind('click', function() {
			var $targetLi = $(this);
			if (!$targetLi.hasClass('active')) {
				$targetLi.addClass('active').siblings().removeClass('active');
				$.ajax({
					type : "post",
					url : "view",
					data : {
						viewName : $targetLi.attr("id")
					},
					dataType : "html",
					success : function(html) {
						$("#content").html(html);
					}
				});
			}
			;
		});
	});
</script>

