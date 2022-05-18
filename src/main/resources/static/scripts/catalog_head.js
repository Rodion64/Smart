function fillFrst() {
    let Container_1 = document.querySelector(".products_1");
    Container_1.innerHTML = `
    <div class="products">
    <div class="products_main">
    <div class="products_main_text">
        Радиоуправляемые игрушки <span class="mark">9 товаров</span>
    </div>
    <div class="products_main_head">
        <div class="products_main_head_left">



        </div>

        <div class="products_main_head_right">
            <div class="right_item item_text">Фильтры</div>
            <div class="right_item item_text">Цена, ₽</div>
            <div class="right_item">
                <input type="text" value="0">
                <div>-</div>
                <input type="text" value="16000">
            </div>
            <div class="right_item item_text">Наличие товара</div>
            <div class="right_item"><input type="checkbox">Доступен самовывоз</div>
            <div class="right_item"><input type="checkbox">Забрать через 5 минут</div>
            <div class="right_item item_text_1">Рекомендуемый возраст</div>
            <div class="right_item"><input type="checkbox">от 10 лет</div>
            <div class="right_item"><input type="checkbox">от 12 лет</div>
            <div class="right_item"><input type="checkbox">от 3 лет</div>
            <div class="right_item"><input type="checkbox">от 4 лет</div>
            <div class="right_item"><input type="checkbox">от 5 лет</div>
            <div class="right_item"><input type="checkbox">от 6 лет</div>
        </div>
        </div>
    </div>
</div>
    `
}