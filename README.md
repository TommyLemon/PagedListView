# PagedListView
Scroll ListView faster and more accurate

ListView等滚动位置经常不符合用户期望：

很多时候都是看完一页想滑到下一页，但滑动一次距离往往不是不够就是超过，很难控制。

 

PagedListView工程中提供了PageScoller来解决这个问题。

使用PageScoller可以在 中低速滑动 后会滚动一页，很慢滑动 或 很快滑动 则按默认处理。

 
## Usage

1.初始化PageScoller

    pageScoller = new PageScoller(listView);
    pageScoller.init();
 
 
2.重写dispatchTouchEvent方法

在Activity的dispatchTouchEvent方法内 pageScoller.dispatchTouchEvent(ev); 具体如下：

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
 
         pageScoller.dispatchTouchEvent(ev);
 
         return super.dispatchTouchEvent(ev);
    }



## 欢迎Star，欢迎Fork

[https://github.com/TommyLemon/PagedListView](https://github.com/TommyLemon/PagedListView)

## 下载试用

[PagedListView.apk](http://files.cnblogs.com/files/tommylemon/PagedListView.apk)
