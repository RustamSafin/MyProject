$(document).ready(function () {
    $(document).on('blur','.js_Change', function() {
        var $this = $(this);
        var count=$this.val();
        $.ajax({
            type: 'POST',
            url: '/cart/change',
            data: {
                goodId: $this.data('id'),
                count: count
            },
            success: function (data, status) {  // успешное завершение работы
                console.log('/cart/change result: data=' + data + '; status=' + status);
                if (data == 'done') {
                    alert('Количество изменено');
                }
            },
            error: function () {    // На сервере произошла ошибка
                alert('Приносим извинения.<br/>На сервере произошла ошибка');
            }
        });
    });
    $('.close1').on('click', function(){
        var $this = $(".close1");
        var goodId=$this.data('id');
        $('.'+$this.data('id')).fadeOut('slow', function(){
            $.ajax({
                type: 'POST',
                url: '/cart/remove',
                data: {
                    goodId: goodId
                },
                success: function(data,status) {
                    console.log('/cart/remove result: data=' +data + '; status=' + status);
                    if (data == 'removed') {
                        alert('Удалено');
                        $('.'+$this.data('id')).remove();
                    }
                },
                error: function () {
                    alert('Приносим извинения.<br/>На сервере произошла ошибка');
                }
            });

        });
    });
});