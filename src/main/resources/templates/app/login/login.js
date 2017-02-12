'use strick';

var blogLogin = angular.module('blogLogin', ['ngRoute']);

blogLogin.config(function ($routeProvider) {
    $routeProvider
        .when('/login', {
            templateUrl: 'login/login',
            controller: 'blog.loginController'
        });
});

blogLogin.controller('blog.loginController', function ($scope, $log, $location, $http, loginService) {

});
blogLogin.service('loginService', function ($http, $log, $q, $location, $rootScope, $cookies) {
    var self = this;

    var preLogin = function () {
        var def = $q.defer();
        $http.get('/login').success(function (response) {
            def.resolve(response);
        }).error(function () {
            def.reject();
        });
    };

    var login = function (name, pwd) {
        preLogin().then(function (response) {
            var account = {username: name, password: pwd, _};
            $http.post('/login', account);
        });
    }

    self.preLogin = preLogin();
});


