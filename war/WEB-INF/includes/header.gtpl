<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Yellowing
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20110123

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />

	<title>Gateway Groovy Users Group</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" media="screen" />
	<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true&amp;key=ABQIAAAAXeAx6Va9xJMTHMkJ3KHQXBR089gojpiYpr9pmoV8AD1kGAjfxRSypNugFT2Z93FiS3pywH79GDklyg" type="text/javascript"></script>

	<script type="text/javascript">

		function initialize_map()	{

			var map = new GMap2(document.getElementById("map"));
			map.setCenter(new GLatLng(38.639781,-90.474928), 10);
			map.addControl(new GLargeMapControl());
			map.addControl(new GMapTypeControl());
			map.setMapType(G_HYBRID_MAP);

			var m = new GMarker(new GLatLng(38.639781,-90.474928))
			map.addOverlay(m);

			var info = "<h4 style='margin:0'>" + "Lutheran Hour Ministries" + "</h4>" + "660 Mason Ridge Center Drive" + "<br/>" + "St. Louis, MO"

			m.openInfoWindowHtml(info);


		}

	</script>

</head>
<body onload="initialize_map()">
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="/">Gateway Groovy </a></h1>
			<p>St Louis Groovy & Grails Users Group</p>
		</div>
	</div>
	<!-- end #header -->
	<div id="page">
		<div id="page-bgtop">
			<div id="page-bgbtm">
				<div id="menu">
					<ul>
						<li class="current_page_item"><a href="/">Home</a></li>
						<li><a href="/blog">Dave's Blog</a></li>
						<li><a href="/photos">Photos</a></li>
						<li><a class="external" href="http://www.meetup.com/GatewayGroovyUsers/">Meetings</a></li>
						<li><a href="mailto:admin@gatewaygroovy.org">Contact</a></li>
					</ul>
				</div>
				<!-- end #menu -->