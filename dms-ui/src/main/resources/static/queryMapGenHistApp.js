var mainModule = angular.module("MainModule", ['ui.bootstrap']);
// var mainModule = angular.module("MainModule", ['ui.bootstrap','ngTouch', 'ui.grid']);

mainModule.controller("MapGenHistController",
  function($scope, $http, $filter, $timeout) {
    // date pickers
    $scope.fromDateOpen = function() {
      $timeout(function() {
        $scope.fromDateOpened = true;
      });
    };
    $scope.toDateOpen = function() {
      $timeout(function() {
        $scope.toDateOpened = true;
      });
    };

    // TODO autocomplete service
    $scope.waferIdList = ['N12345.01', 'N12345.02', 'L54321.01'];

    // Query
    $scope.query = function(queryCondition) {
      // $scope.result = angular.copy(queryCondition);    
      var contentUrl = '/mapGenHist/search/findByWaferIdAndSortNo?'+
        'waferId=' + queryCondition.waferId + 
        '&sortNo=' + queryCondition.sortNo;      
      $http.get(contentUrl).success(function(data) {   
          $scope.result=data._embedded;          
      });
    };

    // Show map content
    $scope.showMap = function(mapGenHist) {
      // TODO file management service
      $scope.mapContent = mapGenHist.waferId + '_'+ 
        mapGenHist.sortNo + mapGenHist.claimTime;
    };    
  }
);

