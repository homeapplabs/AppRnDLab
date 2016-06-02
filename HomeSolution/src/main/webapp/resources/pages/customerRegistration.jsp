<section>
<div align="right" class="header"><label>Registration Form</label></div>
	<div class="homesolution-form-content" align="center">
		<form name="registrationForm" data-toggle="validator" role="form"
			enctype='application/json' align="center">
			<br />
			<div class="row" align="center">
				<!-- <section layout="row" layout-sm="column" layout-align="center"
					layout-wrap> -->

				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>Username</label>
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/user.svg"></md-icon> -->
					<input required type="text" name="username" id="username-id" ng-model="username" />
					<div ng-messages="registrationForm.username.$error" align="right">
						<div ng-message="required">Username is required</div>
					</div>
					</md-input-container>
				</div>

				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>Email</label>
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/user.svg"></md-icon> -->
					<input required type="text" name="email" id="email-id" ng-model="email" />
					<div ng-messages="registrationForm.email.$error" align="right">
						<div ng-message="required">Email is required</div>
					</div>
					</md-input-container>
				</div>
			</div>

			<div class="row" align="center">
				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>Password</label>
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/password.svg" class="name"> </md-icon> -->
					<input required type="password" name="password" id="password-id" ng-model="password" />
					<div ng-messages="registrationForm.password.$error" align="right">
						<div ng-message="required">Password is required</div>
					</div>
					</md-input-container>
				</div>

				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>Re-Enter Password</label> 
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/password.svg" class="name"> </md-icon> -->
					<input required type="password" name="reEnterPassword" id="reEnterPassword-id" ng-model="reEnterPassword" />
					<div ng-messages="registrationForm.reEnterPassword.$error" align="right">
						<div ng-message="required">Password is required</div>
					</div>
					</md-input-container>
				</div>
				
				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>First Name</label>
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/user.svg"></md-icon> -->
					<input required type="text" name="fName" id="fName-id" ng-model="fName" />
					<div ng-messages="registrationForm.fName.$error" align="right">
						<div ng-message="required">First Name is required</div>
					</div>
					</md-input-container>
				</div>

				<div class="form-group col-md-5" align="center">
					<md-input-container class="md-block"> <label>Last Name</label>
					<!-- <md-icon md-svg-src="/HomeSolution/resources/images/user.svg"></md-icon> -->
					<input required type="text" name="lName" id="lName-id" ng-model="lName" />
					<div ng-messages="registrationForm.lName.$error" align="right">
						<div ng-message="required">Last Name is required</div>
					</div>
					</md-input-container>
				</div>
				<!-- </section> -->
			</div>
			<div class="header" align="right"><label>Address Detail</label></div>
			<hr/>	
			<div ng-include="'/HomeSolution/resources/pages/Address.jsp'"></div>
		</form>
	</div>
</section>