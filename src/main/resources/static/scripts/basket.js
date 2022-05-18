h = [];
let m = {"1_1" : {1 : " Apple iPhone 13 Pro Max 128Gb Graphite", 2:"106180", 3: "Тип:Смартфон<br><br> сканер LiDAR, защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe"},
    "1_2" : {1 : "Apple iPhone SE (2020) 64Gb Black", 2:" 39780", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."},
    "1_3" : {1 : "Apple iPhone 12 128Gb Red", 2:"63580", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."},
    "1_4" : {1 : "Apple iPhone 12 64Gb White", 2:"54780", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."},
    "1_5" : {1 : "Apple iPhone 13 256Gb Midnight", 2:" 86480", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."},
    "1_6" : {1 : "Apple iPhone 12 64Gb Purple", 2:"59780", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."}, 
    "1_7" : {1 : "Купить Apple iPhone 13 256Gb Green", 2:"81780", 3: "Тип: "}, 
    "1_8" : {1 : "Apple iPhone 13 Mini 256Gb Red", 2:"76780", 3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."},
    "1_9" : {1 : "Apple iPhone 13 Mini 128Gb / Blue", 2:"71780", 3: "Тип: Смартфон"},
    "2_1" : {1 : "Samsung Galaxy A03 SM-A035F/DS 32Gb+3Gb LTE Black", 2:"12100", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "2_2" : {1 : "Samsung Galaxy S22 (SM-S901B/DS) 256Gb+8Gb 5G White", 2:"94350", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "2_3" : {1 : "Samsung Galaxy Note 20 Ultra (Snapdragon 865+) 256Gb+12Gb 5G Black", 2:"102980", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "2_4" : {1 : "Samsung Galaxy S20 FE SM-G780G 128Gb+6Gb Dual LTE Red", 2:"44950", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "2_5" : {1 : "Samsung Galaxy Z Flip 3 SM-F711B/DS 256Gb+8Gb Dual 5G Black ", 2:"87370", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "2_6" : {1 : "Samsung Galaxy S22 Ultra 256Gb+12Gb 5G Black", 2:"143110", 3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."},
    "3_1" : {1 : "Honor 50 Lite 6+128GB Space Silver", 2:"21 999", 3: "Описание: Honor 50 Lite – смартфон с квадрокамерой и модулем бесконтактной оплаты услуг NFC, работает на операционной системе Android 11 с поддержкой сервисов Google."},
    
    
    
    "3_5" : {1 : "Honor Magic 3 Pro 512Gb+12Gb Dual 5G White", 2:"102980", 3: "Описание:"},
    
    
    
    "4_4" : {1 : "HUAWEI P40 Pro lite", 2:"23999", 3: "Описание:лагодаря аккумулятору емкостью 4 200 мА*ч смартфон будет работать целый день без дополнительной подзарядки5. Но даже если вы забыли зарядить его ночью, не переживайте."},
    "4_5" : {1 : "HUAWEI P40 Pro+", 2:"99999", 3: "Описание: Высокочувствительный основной объектив 50 МПУльтрасенсор 1/1.28 дюйма Массив цветовых фильтров RYYBФазовый атофокус Octa PDДелайте четкие, детальные снимки с хорошим освещением"},
    "4_6" : {1 : "HUAWEI P40 Pro", 2:"69999", 3: "Описание: Высокочувствительный основной объектив 50 МПУльтрасенсор 1/1.28 дюйма Массив цветовых фильтров RYYBФазовый атофокус Octa PDДелайте четкие, детальные снимки с хорошим освещением"},
    "5_3" : {1 : "Oneplus 9 256Gb+12Gb Dual 5G Purple", 2:"48980", 3: "Процессор	Qualcomm Snapdragon 888"},
    "5_4" : {1 : "Oneplus Nord 2 5G 128Gb+8Gb Dual Blue", 2:"38980", 3: "Стандарт	GSM 900/1800/1900, 3G, 4G LTE, 5G, LTE-A"},
    "5_5" : {1 : "Oneplus 10 Pro 256Gb+8Gb Dual 5G Black", 2:"80980", 3: "Емкость аккумулятора	5000 мА⋅ч"},
    "6_7" : {1 : "Google Pixel 6 128Gb+8Gb Dual 5G Stormy Black", 2:"58980", 3: "Описание: Процессор	Google Tensor (5 nm)"}, 
}

function add_2() {

    console.log(localStorage.getItem('b'));
    let rt = localStorage.getItem('b');
    bskt = [];
    let answer = "";
    for (let i = 0; i < rt.length; i++) {
        if (rt[i] != ',') {
            answer += rt[i];
        }
        else {
            bskt.push(answer);
            answer = "";
        }
    }
    bskt.push(answer);
    if (bskt[0] == ""){
        bskt.splice(0, 1);
    }

    console.log(bskt);
    for (let i = 0; i < bskt.length; i++) {
        add_html(bskt[i]);
    }

    function add_html(x) {
        h.push(x);
        sum_cost();
        let Container_2 = document.querySelector(".products_main_head_left");
        Container_2.insertAdjacentHTML('afterbegin',  `
            <div class="products_main_head_left_box">
                        <a class="products_main_head_left_box_item" href="/product_${x}">
                            <img class="center_menu_img" src="image/img_${x}.jpg" alt="">
                        </a>
                        <div class="products_main_head_left_box_item">
                            <div class="name">${m[x][1]}</div>
                        </div>
                        <div class="products_main_head_left_box_item">
                            <div class="price">${m[x][2]}₽</div>
                            <div class="favorites_icon" onclick="Del_1(${x})"> </div>
                        </div>
            </div>
        `)
    }
    
}   
 
function Del_1(x){  
    let r = "" + x;
    r = r[0] + "_" + r[1];

    for (let i = 0; i < h.length; i++){
        if (h[i] == r) {
            h.splice(i, 1);
            localStorage.setItem('b', h);
            break;
        }
    }

    location.reload(); // перезагружаем страницу
}

function sum_cost(){
    let cost = 0;
    for (let i = 0; i < h.length; i++){
        cost += Number(m[h[i]][2]);
    }
    console.log(cost);
    return cost;
}
function sum_pr(){
    let pr = 0;
    for (let i = 0; i < h.length; i++){
        pr += 1;
    }
    return pr;
}

function add_menu() {
    let Container_2 = document.querySelector(".item_text_1");
    Container_2.innerHTML = `
    Кол-во товара: ${sum_pr()}`
    
    let Container_3 = document.querySelector(".item_text_3");
    Container_3.innerHTML = `${sum_cost()}₽`
    let Container_4 = document.querySelector(".cost_1");
    Container_4.innerHTML = `Итого: ${sum_cost()}₽`
}