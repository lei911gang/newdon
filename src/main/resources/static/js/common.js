//导航选择器
var url = window.location.href;
if (url.indexOf("customerList") > 0
		|| url.indexOf("customerEdit") > 0) {
	$("#customer").addClass("active");
	$("#contract").addClass("active");
} else if (url.indexOf("contractList") > 0 || url.indexOf("contractEdit") > 0) {
	$("#customer").addClass("active");
	$("#contract").addClass("active");
}

// 提示条配置
toastr.options = {
	"closeButton" : true,
	"debug" : false,
	"progressBar" : true,
	"preventDuplicates" : false,
	"positionClass" : "toast-top-right",
	"onclick" : null,
	"showDuration" : "400",
	"hideDuration" : "1000",
	"timeOut" : "7000",
	"extendedTimeOut" : "1000",
	"showEasing" : "swing",
	"hideEasing" : "linear",
	"showMethod" : "fadeIn",
	"hideMethod" : "fadeOut"
}