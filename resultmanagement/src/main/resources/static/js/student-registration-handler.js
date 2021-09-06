/**
 * Student Registration Handler
 */

$(document).ready(function() {
	DataCache.loadCache()
		.then(() => {
			StudentRegistrationHandler.init();
			StudentRegistrationHandler.enableSelect2OnCountry();
		});
});

var StudentRegistrationHandler = function() {

	function init() {
		createAspectCustomDataAdapter();
	}

	function createAspectCustomDataAdapter() {
		$.fn.select2.amd.define('select2/data/customAdapter', [
			'select2/data/array', 'select2/utils'], function(ArrayAdapter,
				Utils) {
			var content = DataCache.getCountries();
			function CustomDataAdapter($element, options) {
				CustomDataAdapter.__super__.constructor.call(this, $element,
					options);
			}
			Utils.Extend(CustomDataAdapter, ArrayAdapter);

			CustomDataAdapter.prototype.query = function(params, callback) {
				var pageSize = 10;
				var results = content;
				if (params.term && params.term !== '') {
					results = content.filter(function(e) {
						return e["text"].toUpperCase().indexOf(params.term.toUpperCase()) >= 0 || e["id"].toUpperCase().indexOf(params.term.toUpperCase()) >= 0;
					});
				} else {
					results = content;
				}

				if (!("page" in params)) {
					params.page = 1;
				}
				var data = {};
				data.results = results.slice((params.page - 1) * pageSize, params.page * pageSize);
				data.pagination = {};
				data.pagination.more = params.page * pageSize < results.length;
				callback(data);
			};

			return CustomDataAdapter;
		});
	}

	function enableSelect2OnCountry() {
		var customAdapter = $.fn.select2.amd.require("select2/data/customAdapter");
		$("#permanentAddrCountry, #correspondenceAddrCountry").select2({
			dropdownCssClass: "select2DropDown",
			placeholder: "Country...",
			width: "100%",
			allowClear: false,
			closeOnSelect: true,
			data: DataCache.getCountries(),
			ajax: {},
			dataAdapter: customAdapter
		});
	}

	return {
		init: init,
		enableSelect2OnCountry: enableSelect2OnCountry
	}
}();