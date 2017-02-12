'use strick';

angular.module('blog', ['ngResource', 'ngCookies', 'ngRoute', 'ngSanitize', 'blogCommon', 'blogLogin']);

angular.module('blog').config(['$httpProvider', '$locationProvider',
    function ($httpProvider, $locationProvider) {
        $httpProvider.interceptors.push('responseHandler');
        $locationProvider.hashPrefix('!');
}]);