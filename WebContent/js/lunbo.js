function AddCarousel(baseObj) {
    var that = this;
    this.baseWidth = $('#lunbo1').width(); //父div的宽度
    // alert("width "+$('#lunbo1').width());
    this.$item = $('.lunbo-item');
    this.item = {};
    this.item.width = $('.lunbo-item').width(); //轮播单元的宽度
    // this.item.margin = $('.lunbo-item').css('margin'); //轮播单元的外边距
    this.item.count = $('.lunbo-item').length; //轮播单元的数量

    $('.left-arrow').click(function() {
        if (that.speIndex == 0) {
            that.speIndex = that.item.count;
        }
        that.moveToCenter(that.speIndex - 1);
    });

    $('.right-arrow').click(function() {
        if (that.speIndex == that.item.count - 1) {
            that.speIndex = -1;
        }
        that.moveToCenter(that.speIndex + 1);
    });

    //给所有的轮播单元添加一个属性（data-itemid）
    for (var i = 0; i < this.item.count; i++) {
        this.$item.eq(i).attr('data-itemid', i);
    }

    //返回
    this.showItemCount = function() {
        var leftMargin = getMargin(3);
        var rightMargin = getMargin(1);
        this.item.allWidth = this.item.width + leftMargin + rightMargin;
        if (this.baseWidth < this.item.allWidth) {
            console.error('外窗口的宽度不能小于轮播单元的宽度');
            return 1;
        }
        var itemCount = Math.floor(this.baseWidth / this.item.allWidth);
        return Math.floor((itemCount + 1) / 2);
    };

    // 给原先的轮播item添加头和尾，可以实现首尾连接循环
    this.dealItems = function() {
        this.item.addItemNum = this.showItemCount();
        var addHead = this.$item.slice(0, this.item.addItemNum);
        var addFoot = this.$item.slice(this.item.count - this.item.addItemNum);
        $('.lunbo-window>ul').prepend(getOuthtml(addFoot)).append(getOuthtml(addHead));

    };

    // 轮播item移至窗口中央
    this.moveToCenter = function(i) {
        $('.spe-lunbo-item').removeClass('spe-lunbo-item');
        $('.lunbo-item').eq(i+this.item.addItemNum).addClass('spe-lunbo-item');
        if(!this.firstItemLeft){
            this.firstItemLeft = $('[data-itemid=0]')[0].offsetLeft + parseInt($('.spe-lunbo-item').width()) / 2 - this.baseWidth / 2;
        }
        $('.lunbo-window')[0].scrollLeft = this.firstItemLeft + this.item.allWidth * i;
        this.speIndex = i;
    };
    this.dealItems();
    // 添加点击移至中间事件
    $('.lunbo-item').on('click', function() {
        var index = parseInt($(this).attr('data-itemid'));
        that.moveToCenter(index);
    });

    this.moveToCenter(0);
}

function getOuthtml(arr) {
    var str = '';
    for (var i = 0; i < arr.length; i++) {
        str += arr[i].outerHTML;
    }
    return str;
}

/**
 * 获取外边距的其中一种
 * @param  {[string]} a    通过jq获取的外边距
 * @param  {[int]} type 【0：上，1：右，2：下， 3：左】
 */
function getMargin(type) {
    type = type || 0;
    var result = null;
    switch (type) {
        case 0:
            result = $item.css('margin-top');
            break;
        case 1:
            result = $item.css('margin-right');
            break;
        case 2:
            result = $item.css('margin-bottom');
            break;
        case 3:
            result = $item.css('margin-left');
            break;
    }
    return parseInt(result);
}
AddCarousel();