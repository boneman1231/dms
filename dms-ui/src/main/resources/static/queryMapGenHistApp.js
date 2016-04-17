var app = angular.module("MainModule", ['ui.bootstrap', 'smart-table']);
// var mainModule = angular.module("MainModule", ['ui.bootstrap','ngTouch', 'ui.grid']);

app.controller("MapGenHistController",
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
          // smart table
          $scope.mapGenHistList=data._embedded.mapGenHist;
      });
    };

    // Show map content
    $scope.showMap = function(mapGenHist) {
      // TODO file management service
      $scope.mapContent = mapGenHist.waferId + '_'+ 
        mapGenHist.sortNo + mapGenHist.claimTime;
    };    
    
    $scope.query({
      waferId: "N12345.01",
      sortNo: "G"
    });

    // smart table
    $scope.rowList = [];
    $scope.addItem = function(mapGenHist) {
      $scope.rowList.push({
            waferId: "N12345.10",
            sortNo: "A",
            claimUser: "Tim",
            claimMemo: "randon added",
            accessApplication: "system"
        });      
    };    
    $scope.removeRow = function(mapGenHist) {
      var index = $scope.rowList.indexOf(mapGenHist);
        if (index !== -1) {
            $scope.rowList.splice(index, 1);
        }
    };    
  }
);

