<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/adminstyle.css">
<link rel="icon" type="image/x-icon" href="image/logo2.png" />
<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>CodeFe Admin</title>
</head>
<body>
	<div class="sidebar">
		<div class="logo-details">
			<div class="logo_name">CodeFe</div>
			<i class='bx bx-menu' id="btn"></i>
		</div>
		<li><a href="${pageContext.request.contextPath}/NumberController"
			method="post"> <i class='bx bx-grid-alt'></i> <span
				class="links_name">Dashboard</span>
		</a> <span class="tooltip">Dashboard</span></li>
		<li><a
			href="${pageContext.request.contextPath}/CustomerController"
			method="post"> <i class='bx bx-group'></i> <span
				class="links_name">Customer</span>
		</a> <span class="tooltip">Customer</span></li>
		<li><a
			href="${pageContext.request.contextPath}/MessageController"> <i
				class='bx bx-chat'></i> <span class="links_name">Messages</span>
		</a> <span class="tooltip">Messages</span></li>
		<li><a href="${pageContext.request.contextPath}/BillController"> <i
				class='bx bx-pie-chart-alt-2'></i> <span class="links_name">Analytics</span>
		</a> <span class="tooltip">Analytics</span></li>
		<li><a
			href="${pageContext.request.contextPath}/FoodDrinkController"> <i
				class='bx bx-cart-alt'></i> <span class="links_name">Menu</span>
		</a> <span class="tooltip">Menu</span></li>

		<li><a href="login/login.jsp"> <i class='bx bx-log-out'></i>
				<span class="links_name">Log out</span>
		</a> <span class="tooltip">Log out</span></li>
		</ul>
	</div>
	<!-- noi dung-->
	<section class="home-section">
		<div class="container">
			<div class="card">

				<h5>Customer</h5>
				<br>
				<h6>${listCustomer.size()}</h6>

			</div>

			<div class="card">

				<h5>Menu</h5>
				<br>
				<h6>${listFoodDrink.size()}</h6>

			</div>

			<div class="card">

				<h5>Message</h5>
				<br>
				<h6>${listMessage.size()}</h6>

			</div>

			<div class="card">
			
				<h5>Total Bill: ${listBill.size()}</h5>

				<h5>Total Income</h5>
				<h6>${total} VND</h6>

			</div>
		</div>
	</section>

	<script>
        let sidebar = document.querySelector(".sidebar");
        let closeBtn = document.querySelector("#btn");
        let searchBtn = document.querySelector(".bx-search");

        closeBtn.addEventListener("click", () => {
            sidebar.classList.toggle("open");
            menuBtnChange();//calling the function(optional)
        });

        searchBtn.addEventListener("click", () => { // Sidebar open when you click on the search iocn
            sidebar.classList.toggle("open");
            menuBtnChange(); //calling the function(optional)
        });

        // following are the code to change sidebar button(optional)
        function menuBtnChange() {
            if (sidebar.classList.contains("open")) {
                closeBtn.classList.replace("bx-menu", "bx-menu-alt-right");//replacing the iocns class
            } else {
                closeBtn.classList.replace("bx-menu-alt-right", "bx-menu");//replacing the iocns class
            }
        }
    </script>
</body>
</html>