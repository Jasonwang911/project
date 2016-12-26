/**
 * Created by Jason on 2016/12/25.
 */
var app=angular.module('jianshu',[]);

//自定义过滤器，由于后台数据含有标签需要使用$sce服务处理数据
app.filter('showHtml',['$sce',function($sce){
    return function(input){
        return $sce.trustAsHtml(input);
    }
}]);

app.controller('index_m',['$scope','$http',function($scope,$http){
    /*分类列表接口*/
    //分类列表的初始值
    $scope.categoryNow=1;
    $http.get('/ports/jianshu/category.do').success(function(res){
        if(res.code==100){
            $scope.categoryList=res.data;
            $scope.setCategoryNow=function(now){
                $scope.categoryNow=now;
                //在转换列表的时候获取当前页的文章内容
                getArticleList();
            };
        }else{
           alert('获取失败:'+res.code);
        }
    }).error(function(){
        alert('获取信息失败，请重试');
    });

    //文章列表的page的初始值
    $scope.pageNow=1;
    getArticleList();
    function getArticleList(){
        $http.get('/ports/jianshu/articles/'+$scope.categoryNow+'/'+$scope.pageNow+'.do').success(function(res){
            if(res.code==100){
                $scope.categoryContent=res.data;
            }else{
                alert('获取失败：'+res.code);
            }
        }).error(function(){
            alert('获取信息失败，请重试');
        });
    }

}]);

//文章内容
app.controller('articleList_m',['$scope','$http',function($scope,$http){
    var id=location.search.substring(1).split('=')[1];
    $http.get('/ports/jianshu/articleInfor/'+id+'.do').success(function(res){
        if(res.code==100){
            $scope.articleInfo=res.data;
        }else{
            alert('失败了'+res.code);
        }
    }).error(function(){
        alert('失败');
    });
}]);


