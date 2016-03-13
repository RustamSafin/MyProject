$(document).ready(function () {
    $(document).on('blur','.js_Change', function() {
        var $this = $(this);
        $.ajax({
            type: 'POST',
            url: '/cart/change',
            data: {
                goodId: $this.data('id'),
                count: $this.count('count')
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
    //function check_symbol(event) {
    //    event= event || window.event;
    //    if ((event.keyCode > 57 || event.keyCode <48) && (event.keyCode<35 || event.keyCode>39) && event.keyCode!=8)
    //    return false;
    //}
});