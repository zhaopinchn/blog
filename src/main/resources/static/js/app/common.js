'use strick';

angular.module('blogCommon').factory('responseHandler', function ($q, $rootScope, $location, $injector, $log, $cookies) {
    return {
        'responseError': function (response) {
            var status = response.status;
            if(status === 401 || status == 403) {
                $log.debug('Access is denied to this require.');
                $location.path('/login');
            }
        }
    };
});

