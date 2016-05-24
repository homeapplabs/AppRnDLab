<section>
{{message}}
    <div class="virgin-form-content">
        <form name="loginForm" data-toggle="validator" role="form" enctype='application/json'>
            <br/>
            <div class="row">
                <div class="form-group col-md-5 md-block">
                    <label>Trip Type</label>
                    <md-radio-group ng-model="trip_type.name" ng-init="trip_type.name='roundtrip'">
                        <md-radio-button id="roundTrip" name="trip_type" value="roundtrip"  >Roundtrip</md-radio-button>
                        <md-radio-button id="oneWay" name="trip_type" value="oneway" >One Way</md-radio-button>
                        <md-radio-button id="Multicity" name="trip_type" value="multicity" >Multicity</md-radio-button>
                    </md-radio-group>
                </div>
                <div class="form-group col-md-5 md-block">
                    <label>Booking Type</label>
                    <md-radio-group ng-model="bookingType.name" ng-init="bookingType.name='dollar'">
                        <md-radio-button id="dollar" name="booking_type" value="dollar">Dollar</md-radio-button>
                        <md-radio-button id="point" name="booking_type" value="points">Points</md-radio-button>
                    </md-radio-group>
                </div>
            </div>
            </form>
            </div>
            </section>


