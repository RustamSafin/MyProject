/**
 * Created by Kamil
 * on 01.03.2016.
 */
$(document).ready(function () {

    $(document).on('click', '#showMore', function () {
        var $this = $(this);
        var page = $this.data('page'),
            limit = $this.data('limit');
        $.ajax({
            type: "POST",
            url: "/catalog/showMore",
            data: {
                //id: $this.data('id'),
                page: page,
                limit: limit
            }
        }).done(function (data) {  // сюда приходит ответ при успехе
            //console.log(data);
            if (data != '') {
                $("#goodList").append(data);
                updateCounter();
            } else {
                $this.hide();
            }
        }).fail(function () {// сюда приходит ответ если на сервере прооизошла ошибка
            $this.hide();

        });

        function updateCounter() {
            $this.data('page', page + 1).attr('data-page',page+1);
            var $goodsCount = $('#goodsCount');
            var goodsCount = parseInt($goodsCount.text());
            if (goodsCount > limit) {
                $goodsCount.text(goodsCount - limit);
                $('#limit').text(Math.min(limit, goodsCount - limit))
            } else {
                $this.hide();
            }
        }
    });

    // верно!!!
    $(document).on('click', '.js_addToCart', function () {
        event.preventDefault();
        var $this = $(this);
        $.ajax({
            type: 'POST',
            url: '/cart/add',
            data: {goodId: $this.data('id')},
            success: function (data, status) {  // успешное завершение работы
                console.log('/cart/add result: data=' + data + '; status=' + status);
                if (data == 'ok') {
                    $this.removeClass('js_addToCart').text('To cart').css('background', 'rgb(280, 124, 83)');
                }
            },
            error: function () {    // На сервере произошла ошибка
                alert('Приносим извинения.<br/>На сервере произошла ошибка');
            }
        });
    });

    $(document).on('click', '.js_goodDetail', function () {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: '/good/' + $(this).data('id'),
            dataType: 'json',
            success: function (data, status) {  // успешное завершение работы
                alert(JSON.stringify(data, "", 4));
            },
            error: function (error) {    // На сервере произошла ошибка
                alert('Приносим извинения.<br/>На сервере произошла ошибка<br/>' + error);
            }
        });
    });
    $(document).on('click', '.js_Sort', function() {
        var $this=$(this);
        var sort=$(this).data('sort');
        $.ajax({
            type: 'GET',
            url: '/catalog/sort',
            data: {
                sort:sort
            },
            success: function (data) {  // успешное завершение работы
                //console.log('/catalog/ result: data=' + data + '; status=' + status);
                $('#goodList').remove();
                $('.goods').append(data);
            },
            error: function () {    // На сервере произошла ошибка
                alert('Приносим извинения.<br/>На сервере произошла ошибка');
            }
        })
    });
    $(document).on('click','.find',function() {
        var sizes='';
        var brands='';
        var minPrice=$('.minPrice').val();
        var maxPrice=$('.maxPrice').val();
        $('.js_Size').each(function() {
            sizes+=$(this).val()+',';
        });
        $('.js_Brand').each(function() {
            brands+=$(this).val()+',';
        });
        $.ajax({
            type: 'GET',
            url: 'catalog/find',
            data: {
                sizes:sizes,
                brands:brands,
                minPrice:minPrice,
                maxPrice:maxPrice
            },
            success: function (data) {  // успешное завершение работы
                //console.log('/catalog/ result: data=' + data + '; status=' + status);
                $('#goodList').remove();
                $('.goods').append(data);
            },
            error: function () {    // На сервере произошла ошибка
                alert('Приносим извинения.<br/>На сервере произошла ошибка');
            }
        });
    })
});