<section>
	<div class="homesolution-form-content" align="center">
		<form name="loginForm" data-toggle="validator" role="form" enctype='application/json' align="center">
			<br />

			<div class="row" align="center">
				<section layout="row" layout-sm="column" layout-align="center" layout-wrap>
					<div class="form-group col-md-5" align="center">
						<md-input-container class="md-block"> 
						<label>Username/Email</label>
						<md-icon md-svg-src="/HomeSolution/resources/images/user.svg"></md-icon>
						<input required type="text" name="username" id="username" />
						<div ng-messages="loginForm.username.$error">
							<div ng-message="required">Username/Email is required.</div>
						</div>
						</md-input-container>
						
						<md-input-container class="md-block"> 
						<label>Password</label>
						<md-icon md-svg-src="/HomeSolution/resources/images/password.svg" class="name">
						</md-icon> <input required type="password" name="password" id="password">
						<div ng-messages="loginForm.password.$error">
							<div ng-message="required">Password is required.</div>
						</div>
						</md-input-container>
					</div>
				</section>
			</div>

			<div class="row form-group col-md-12" align="center">
				<md-button class="md-raised md-primary" id="submit">Login</md-button>
				<md-button class="md-raised">Register</md-button>
				<a href=""> <label>Forgot Username/Password.</label></a>
			</div>
		</form>
	</div>
</section>


