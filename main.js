$(document).ready(function() {
	// 고정된 화면영역을 조립 : composite-view 패턴
	$('#header').load('include/header.html');
	$('#nav').load('include/nav.html');
	$('#footer').load('include/footer.html');
});