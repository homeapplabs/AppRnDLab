<section>
<form name="addressForm" data-toggle="validator" role="form"
			enctype='application/json'>
			<br/>
<div class="row">
				<div class="form-group col-md-5">
					<md-input-container class="md-block"> <label>Address Line 1</label>
					<input required name="addrLine1" id="addrLine1-id" />
					<!-- <div ng-messages="registrationForm.addrLine1.$error">
						<div ng-message="required">Address Line 1 is required.</div>
					</div> -->
					</md-input-container>
				</div>
				<div class="form-group col-md-5">
					<md-input-container class="md-block"> <label>Address Line 2</label>
					<input required name="addrLine2" id="addrLine2-id" />
					<!-- <div ng-messages="registrationForm.addrLine2.$error">
						<div ng-message="required">Address Line 2 is required.</div>
					</div> -->
					</md-input-container>
				</div>
			</div>
			
			<div class="row">
			<div class="form-group col-md-5" ng-controller="countriesController" align="left">
                    <md-input-container class="md-block">
                        <label>Country</label>
                        <md-select id="country" name="country" ng-model="country" md-selected-text="getSelectedCountry()">
                            <md-optgroup label="countries">
                                <md-option ng-repeat="country in countries" ng-value="country.Id">
                                    {{country.Name}}
                                </md-option>
                            </md-optgroup>
                        </md-select>
                        <div class="errors" ng-messages="addressForm.country.$error" ng-if="addressForm.$dirty">
                            <div ng-message="required" align="right">Country is Required</div>
                        </div>
                    </md-input-container>
                </div>
                
                <div class="form-group col-md-5" ng-controller="citiesController" align="left">
                    <md-input-container class="md-block">
                        <label>City</label> 
                        <md-select id="city" name="city" ng-model="cities" md-selected-text="getSelectedCity()">
                            <md-optgroup label="cities">
                                <md-option ng-repeat="city in cities" ng-value="city.Id">
                                    {{city.Name}}
                                </md-option>
                            </md-optgroup>
                        </md-select>
                        <div class="errors" ng-messages="addressForm.cities.$error" ng-if="addressForm.$dirty">
                            <div ng-message="required" align="right">City is Required</div>
                        </div>
                    </md-input-container>
                </div>
                </div>
                
                <div class="row">
			<div class="form-group col-md-5" align="left">
                    <md-input-container class="md-block"> <label>Pin/Zip</label>
					<input required name="pin_zip" id="pin_zip" />
					<!-- <div ng-messages="registrationForm.addrLine2.$error">
						<div ng-message="required">Address Line 2 is required.</div>
					</div> -->
					</md-input-container>
                </div>
                
                <!-- <div class="form-group col-md-5" ng-controller="citiesController" align="left">
                    <md-input-container class="md-block">
                        <label>City</label> 
                        <md-select id="city" name="city" ng-model="cities" md-selected-text="getSelectedCity()">
                            <md-optgroup label="cities">
                                <md-option ng-repeat="city in cities" ng-value="city.Id">
                                    {{city.Name}}
                                </md-option>
                            </md-optgroup>
                        </md-select>
                        <div class="errors" ng-messages="addressForm.cities.$error" ng-if="addressForm.$dirty">
                            <div ng-message="required" align="right">City is Required</div>
                        </div>
                    </md-input-container>
                </div> -->
                </div>
</form>
</div>
</section>