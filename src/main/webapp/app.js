/**
 * app.js
 */

window.onload = function(){
	loadNavbar();
	loadDashboardView();
	console.log('window loaded');
	
}

function loadNavbar(){
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState == 4 && xhr.status == 200){
			document.getElementById("nav").innerHTML = xhr.responseText;
			document.getElementById("dashboard").addEventListener('click', loadDashboardView, false)
			document.getElementById("tx").addEventListener('click', loadWithdrawalDepositView, false)

		}
	}
	
	xhr.open("GET", "getNavbar", true);
	xhr.send();
}

function loadDashboardView(){
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState == 4 && xhr.status == 200){
			document.getElementById("view").innerHTML = xhr.responseText;
		}
	}
	
	xhr.open("GET", "getDashboardView", true);
	xhr.send();
	
}

function loadWithdrawalDepositView(){
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState == 4 && xhr.status == 200){
			document.getElementById("view").innerHTML = xhr.responseText;
		}
	}
	
	xhr.open("GET", "getTxView", true);
	xhr.send();
}