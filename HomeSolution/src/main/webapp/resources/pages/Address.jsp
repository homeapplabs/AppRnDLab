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
			<div class="form-group col-md-5" ng-controller="countriesController" >
                    <md-input-container class="md-block">
                        <label>Country</label>
                        <md-select id="countries" name="countries" ng-model="countries" md-selected-text="getCountries()">
                            <md-optgroup label="countries">
                                <md-option ng-repeat="country in countries" ng-value="country.Id">
                                    {{country.Name}}
                                </md-option>
                            </md-optgroup>
                        </md-select>
                        <div class="errors" ng-messages="addressForm.countries.$error" ng-if="addressForm.$dirty">
                            <div ng-message="required">Country is Required</div>
                        </div>
                    </md-input-container>
                </div>
                
                <div class="form-group col-md-5" ng-controller="citiesController" >
                    <md-input-container class="md-block">
                        <label>City</label> 
                        <md-select id="city" name="city" ng-model="cities" md-selected-text="getSelectedCity()">
                            <md-optgroup label="cities">
                                <md-option ng-repeat="city in cities" ng-value="city.Id">
                                    {{city.Name}}
                                </md-option>
                            </md-optgroup>
                        </md-select>
                        <div class="errors" ng-messages="addressForm.cities_d2.$error" ng-if="addressForm.$dirty">
                            <div ng-message="required">City is Required</div>
                        </div>
                    </md-input-container>
                </div>
                </div>
</form>
</div>
</section>