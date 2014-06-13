'use strict';

/* Controllers */

function MappingListCtrl($scope, $http) {
    $http.get('/api/eligibleapi/mappingpayers').success(function(data) {
        $scope.mappings = data;
    });

    $scope.orderProp = 'clearinghousePayerID';
}

function MetricsListCtrl($scope, $http) {
    $http.get('/api/metrics/transactions').success(function(data) {
        //angular.forEach(data, function(item) { item.costperclick = 0; });
        $scope.transactions = data;
    });

    $scope.calcRowTotal = function(transaction) {
        var cpc = parseFloat(transaction.costperclick);
        if (!isNaN(cpc)) {
            return transaction.costperclick * transaction.count;
        } else {
            return 0;
        }
    }
}