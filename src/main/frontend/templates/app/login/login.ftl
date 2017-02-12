<div class="container" ng-view>
    <form role="form" action="/login" method="post">
        <div class="form-group">
            <label for="name">用户名</label>
            <input type="text" id="name" name="username" class="form-control" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <input class="btn btn-default" type="submit" value="提交">
    </form>
</div>

