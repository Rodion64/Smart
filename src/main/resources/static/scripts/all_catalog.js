function fillProducts_1() {
    let body = document.getElementsByTagName("body")[0];
    let id = body.getAttribute("id");
    let m = {
        "1_1": {
            1: " Apple iPhone 13 Pro Max 128Gb Graphite",
            2: "106180",
            3: "Тип:Смартфон<br><br> сканер LiDAR, защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe"
        },
        "1_2": {
            1: "Apple iPhone SE (2020) 64Gb Black",
            2: " 39780",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_3": {
            1: "Apple iPhone 12 128Gb Red",
            2: "63580",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_4": {
            1: "Apple iPhone 12 64Gb White",
            2: "54780",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_5": {
            1: "Apple iPhone 13 256Gb Midnight",
            2: " 86480",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_6": {
            1: "Apple iPhone 12 64Gb Purple",
            2: "59780",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_7": {1: "Apple iPhone 13 256Gb Green", 2: "81780", 3: "Тип: смартфон"},
        "1_8": {
            1: "Apple iPhone 13 Mini 256Gb Red",
            2: "76780",
            3: "Тип:Смартфон<br><br>Описание: защита передней панели Ceramic Shield, поддержка беспроводной зарядки и аксессуаров MagSafe."
        },
        "1_9": {1: "Apple iPhone 13 Mini 128Gb / Blue", 2: "71780", 3: "Тип: Смартфон"},
        "2_1": {
            1: "Samsung Galaxy A03 SM-A035F/DS 32Gb+3Gb LTE Black",
            2: "12100",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "2_2": {
            1: "Samsung Galaxy S22 (SM-S901B/DS) 256Gb+8Gb 5G White",
            2: "94350",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "2_3": {
            1: "Samsung Galaxy Note 20 Ultra (Snapdragon 865+) 256Gb+12Gb 5G Black",
            2: "102980",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "2_4": {
            1: "Samsung Galaxy S20 FE SM-G780G 128Gb+6Gb Dual LTE Red",
            2: "44950",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "2_5": {
            1: "Samsung Galaxy Z Flip 3 SM-F711B/DS 256Gb+8Gb Dual 5G Black ",
            2: "87370",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "2_6": {
            1: "Samsung Galaxy S22 Ultra 256Gb+12Gb 5G Black",
            2: "143110",
            3: "Тип:Смартфон<br><br>Производитель оставляет за собой право изменять комплектацию, не уведомляя об этом ни продавца, ни конечного потребителя. Наиболее точную комплектацию Вы можете уточнить у менеджера при оформлении заказа."
        },
        "3_1": {
            1: "Honor 50 Lite 6+128GB Space Silver",
            2: "21 999",
            3: "Описание: Honor 50 Lite – смартфон с квадрокамерой и модулем бесконтактной оплаты услуг NFC, работает на операционной системе Android 11 с поддержкой сервисов Google."
        },


        "3_5": {1: "Honor Magic 3 Pro 512Gb+12Gb Dual 5G White", 2: "102980", 3: "Описание:"},


        "4_4": {
            1: "HUAWEI P40 Pro lite",
            2: "23999",
            3: "Описание:лагодаря аккумулятору емкостью 4 200 мА*ч смартфон будет работать целый день без дополнительной подзарядки5. Но даже если вы забыли зарядить его ночью, не переживайте."
        },
        "4_5": {
            1: "HUAWEI P40 Pro+",
            2: "99999",
            3: "Описание: Высокочувствительный основной объектив 50 МПУльтрасенсор 1/1.28 дюйма Массив цветовых фильтров RYYBФазовый атофокус Octa PDДелайте четкие, детальные снимки с хорошим освещением"
        },
        "4_6": {
            1: "HUAWEI P40 Pro",
            2: "69999",
            3: "Описание: Высокочувствительный основной объектив 50 МПУльтрасенсор 1/1.28 дюйма Массив цветовых фильтров RYYBФазовый атофокус Octa PDДелайте четкие, детальные снимки с хорошим освещением"
        },
        "5_3": {1: "Oneplus 9 256Gb+12Gb Dual 5G Purple", 2: "48980", 3: "Процессор	Qualcomm Snapdragon 888"},
        "5_4": {
            1: "Oneplus Nord 2 5G 128Gb+8Gb Dual Blue",
            2: "38980",
            3: "Стандарт	GSM 900/1800/1900, 3G, 4G LTE, 5G, LTE-A"
        },
        "5_5": {1: "Oneplus 10 Pro 256Gb+8Gb Dual 5G Black", 2: "80980", 3: "Емкость аккумулятора	5000 мА⋅ч"},
        "6_7": {
            1: "Google Pixel 6 128Gb+8Gb Dual 5G Stormy Black",
            2: "58980",
            3: "Описание: Процессор	Google Tensor (5 nm)"
        },
    }

    Object.keys(m).forEach(function (key) {
        if (key.toLowerCase().indexOf(id) != -1) {

            add_1(key, m[key][1], m[key][2]);
        }

    });
}

function add_1(x0, x1, x2) {
    let Container_2 = document.querySelector(".products_main_head_left");
    Container_2.insertAdjacentHTML('afterbegin', `
                <div class="products_main_head_left_box" href="/product_${x0}">
                            <a class="products_main_head_left_box_item" href="/product_${x0}">
                                <img class="center_menu_img" src="image/img_${x0}.jpg" alt="">
 
                            </a>
                            <div class="products_main_head_left_box_item">
                                <div class="name">${x1}</div>
                            </div>
                            <div class="products_main_head_left_box_item">
                                <div class="price">${x2}₽</div>
                                <div class="price_icon"  onclick="Basket_1(${x0})"> </div>
                                <div class="favorites_icon" onclick="Basket_2(${x0})"> </div>
                            </div>
                </div>
            `)
}

function text_name() {
    let tex = {
        "1_": "Радиоуправляемые игрушки", "2_": "Развивающие игрушки", "3_": "Настольные игры",
        "4_": "Интерактивные игрушки", "5_": "Мягкие игрушки", "6_": "Роботы и трансформеры",
        "7_": "Головоломки, пазлы", "8_": "Конструкторы", "9_": "Игровые наборы",
    }
    let body = document.getElementsByTagName("body")[0];
    let id = body.getAttribute("id");
    let Container_3 = document.querySelector(".products_main_text");
    Container_3.innerHTML = `${tex[id]}`
}


if (localStorage.getItem('b') == null) {
    bskt = [];
} else {
    let rt = localStorage.getItem('b');
    let answer = "";
    bskt = []
    for (let i = 0; i < rt.length; i++) {
        if (rt[0] == ',') {
            continue;
        }
        if (rt[i] != ',') {
            answer += rt[i];
        } else {
            bskt.push(answer);
            answer = "";
        }
    }
    bskt.push(answer);
}


function Basket_1(x) {
    let r = "" + x;
    bskt.push(r[0] + "_" + r[1])
    localStorage.setItem('b', bskt);
    console.log(localStorage.getItem('b'));
}


if (localStorage.getItem('f') == null) {
    bskt_1 = [];
} else {
    let rt_1 = localStorage.getItem('f');
    let answer_1 = "";
    bskt_1 = []
    for (let i = 0; i < rt_1.length; i++) {
        if (rt_1[0] == ',') {
            continue;
        }
        if (rt_1[i] != ',') {
            answer_1 += rt_1[i];
        } else {
            bskt_1.push(answer_1);
            answer_1 = "";
        }
    }
    bskt_1.push(answer_1);
}


function Basket_2(x) {
    let r_1 = "" + x;
    bskt_1.push(r_1[0] + "_" + r_1[1])
    localStorage.setItem('f', bskt_1);
    console.log(localStorage.getItem('f'));
}

console.log(bskt_1);