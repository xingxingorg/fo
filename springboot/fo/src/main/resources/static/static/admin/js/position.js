layui.config({
    base: '../../static/admin/js/module/'
}).extend({
    dialog: 'dialog',
});
var data = {
    position: null,
    index: ""
}
layui.use(['form', 'jquery', 'laydate', 'layer', 'laypage', 'dialog', 'element'],
function() {
    var form = layui.form(),
    layer = layui.layer,
    $ = layui.jquery,
    dialog = layui.dialog;
    //搜索
    $('.search').click(function() {
        var pojo = {
            CName: $("#name").val()
        }
        console.log(pojo);
        data.refreshList(pojo);
        return false;

    }).mouseenter(function() {
        dialog.tips('搜索', '.search');
    });
    //添加
    $('.add-btn').click(function() {
        var url = $(this).attr('data-url');
        data.position = null;
        data.index = layer.open({
            type: 2,
            title: $(this).attr('name'),
            area: ['600px', '500px'],
            // scrollbar: false,//禁止浏览器滚动
            // btn: ['确定', '取消'],
            content: "../" + url
        });
        return false;

    }).mouseenter(function() {
        dialog.tips('添加', '.add-btn');
    });
    //编辑
    $('#table-list').on('click', '.edit-btn',
    function() {
        var url = $(this).attr('data-url');
        data.position = $(this).attr('data-id');
        layer.open({
            type: 2,
            title: $(this).attr('name'),
            area: ['600px', '500px'],
            scrollbar: false,
            //禁止浏览器滚动
            content: "../" + url
        });
        return false;
    });
    //删除
    $('#table-list').on('click', '.del-btn',
    function() {
        var id = $(this).attr('data-id');
        layer.msg('您确定要删除吗？', {
            btn: ['确定', '取消']
        },
        function(index, layero) {
            $.ajax({
                type: "POST",
                url: "/fo/delposition",
                //dataType : "json",
                data: {
                    cid: id
                },
                success: function(json) {
                    data.refreshList();
                    layer.msg("保存成功！", {
                        time: 2000
                    });
                    return false;
                },
                error: function(text) {

}
            });
        }

        );
        return false;

    });

    //修改状态
    $('#table-list').on('click', '.table-list-status',
    function() {
        var That = $(this);
        var status = That.attr('data-status');
        var id = That.attr('data-id');
        if (status == 1) {
            status = 2;
            That.removeClass('layui-btn-normal').addClass('layui-btn-warm').html('无效').attr('data-status', 2);
        } else if (status == 2) {
            status = 1;
            That.removeClass('layui-btn-warm').addClass('layui-btn-normal').html('有效').attr('data-status', 1);
        }

        $.ajax({
            type: "POST",
            url: "/fo/validposi",
            //dataType : "json",
            data: {
                cid: id,
                valid: status
            },
            success: function(json) {
                layer.msg("保存成功！", {
                    time: 2000
                });
                return false;
            },
            error: function(text) {

}
        });

        return false;

    })

    //获取当前iframe的name值
    var iframeObj = $(window.frameElement).attr('name');
    //全选
    form.on('checkbox(allChoose)',
    function(data) {
        var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
        child.each(function(index, item) {
            item.checked = data.elem.checked;
        });
        form.render('checkbox');
    });
    //渲染表单
    form.render();

});

/**
 * 控制iframe窗口的刷新操作
 */
var iframeObjName;

//父级弹出页面
function page(title, url, obj, w, h) {
    if (title == null || title == '') {
        title = false;
    };
    if (url == null || url == '') {
        url = "404.html";
    };
    if (w == null || w == '') {
        w = '700px';
    };
    if (h == null || h == '') {
        h = '350px';
    };
    iframeObjName = obj;
    //如果手机端，全屏显示
    if (window.innerWidth <= 768) {
        var index = layer.open({
            type: 2,
            title: title,
            area: [320, h],
            fixed: false,
            //不固定
            content: url
        });
        layer.full(index);
    } else {
        var index = layer.open({
            type: 2,
            title: title,
            area: [w, h],
            fixed: false,
            //不固定
            content: url
        });
    }
}

/**
 * 刷新子页,关闭弹窗
 */
function refresh() {
    //根据传递的name值，获取子iframe窗口，执行刷新
    if (window.frames[iframeObjName]) {
        window.frames[iframeObjName].location.reload();

    } else {
        window.location.reload();
    }

    layer.closeAll();
}