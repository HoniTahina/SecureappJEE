<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign Up</title>
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
<link rel="stylesheet"
	href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css'/>">
</head>
<body>
	<section class="vh-100" style="background-color: #eee;">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-12 col-xl-11">
					<div class="card text-black" style="border-radius: 25px;">
						<div class="card-body p-md-5">
							<div class="row justify-content-center">
								<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

									<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
										up</p>


									<div class="container">
										<form action="signup" method="post">

											<div class="mb-3">
												<label for="exampleInputEmail1" class="form-label">Email</label>
												<input type="text" name="email" class="form-control"
													id="exampleInputEmail1" aria-describedby="emailHelp">
											</div>
											<div class="mb-3">
												<label for="exampleInputPassword1" class="form-label">Password</label>
												<input type="password" name="password" class="form-control"
													id="exampleInputPassword1">
											</div>
											<div class="mb-3">
												<label for="exampleInputPassword1" class="form-label">State</label>
												<input type="text" name="state" class="form-control"
													id="exampleInputPassword1">
											</div>
											<div class="form-check d-flex justify-content-center mb-5">
												<input class="form-check-input me-2" type="checkbox"
													value="" id="form2Example3c" /> <label
													class="form-check-label" for="form2Example3"> I
													agree all statements in <a href="#!">Terms of service</a>
												</label> <a href="login" class="btn btn-secondary">Back
													to Login</a>
											</div>
											<button type="submit" class="btn btn-primary">Submit</button>
										</form>
									</div>
								</div>
								<div
									class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

									<img
										src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
										class="img-fluid" alt="Sample image">

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<script
		src="<c:url value='/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js'/>"></script>
	<!-- MDB -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.2/mdb.umd.min.js"></script>
</body>
</html>
