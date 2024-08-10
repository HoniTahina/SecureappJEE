<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./public/style.css">
<meta charset="UTF-8">
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.2/mdb.min.css"
	rel="stylesheet" />
<title>SecureApp Login</title>
</head>
<body>
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<form action="login" method="post">
						<!-- Email input -->
						<div data-mdb-input-init class="form-outline mb-4">
							<input type="email" id="form1Example13" name="email"
								class="form-control form-control-lg" /> <label
								class="form-label" for="form1Example13">Email address</label>
						</div>

						<!-- Password input -->
						<div data-mdb-input-init class="form-outline mb-4">
							<input type="password" id="form1Example23" name="password"
								class="form-control form-control-lg" /> <label
								class="form-label" for="form1Example23">Password</label>
						</div>

						<div class="d-flex justify-content-around align-items-center mb-4">
							<!-- Checkbox -->
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="form1Example3" checked /> <label class="form-check-label"
									for="form1Example3"> Remember me </label>
							</div>
							<a href="#!">Forgot password?</a>
						</div>
						<p class="mb-5 pb-lg-2" style="color: #393f81;">
							Don't have an account? <a href="signup" style="color: #386BCC;">Register
								here</a>
						</p>
						<!-- Submit button -->
						<button type="submit" data-mdb-button-init data-mdb-ripple-init
							class="btn btn-primary btn-lg btn-block">Sign in</button>

						<div class="divider d-flex align-items-center my-4">
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- MDB -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.2/mdb.umd.min.js"></script>
</body>
</html>