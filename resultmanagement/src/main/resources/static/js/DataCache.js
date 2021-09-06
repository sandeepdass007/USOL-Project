/**
 * Data Cache
 */

var DataCache = function() {
	var cache = {};
	function loadCache() {
		return $.ajax({
			url: '/country/select2/',
			async: true,
			type: 'GET',
			processData: false,
			dataType: 'json',
			contentType: 'application/json',
			success: function(data) {
				cache["country"] = data;
			},
			error: function(xhr, textStatus, errorThrown) {
				throw "Unable to fetch countries list from server. Contact your administrator.";
			}
		});
	}
	
	function getCountries() {
		return cache["country"];
	}

	return {
		loadCache: loadCache,
		getCountries: getCountries
	}

}();