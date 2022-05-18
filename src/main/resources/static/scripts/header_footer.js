function fillHeader() {
    let Container = document.querySelector(".header-container");
    Container.innerHTML = `
    <div class="main_background">
    <div class="wrapper">
    <div class="header">
    <div class="main_menu">
    <div class="logo">
    <a href="/index"><img class="logo_item" width=250px heigth=300px src="img/Logo.png" alt="Logo"></a>
    </div>
    <div class="menu">
    <div class="menu_left">
    <div class="menu_left_item">
    Москва
    </div>
    <div class="menu_left_item"><a href="">+7(968)-608-64-54</a></div>
    </div>
    <div class="menu_right">
    <div class="menu_right_item"><a href="">Журнал</a></div>
    <div class="menu_right_item"><a href="">Акции</a></div>
    <div class="menu_right_item"><a href="">Доставка</a></div>
    <div class="menu_right_item"><a href="">Магазины</a></div>
    <div class="menu_right_item"><a href="">Обратная связь</a></div>
    </div>
    </div>
    </div>
    </div>
    </div>
    </div>
    `
}

function fillHeader_1() {

    let Container = document.querySelector(".menu_bottom");
    Container.innerHTML = `
    <div class="top">
    <div id="nav">
    <div class="nav_menu">
    <p>Каталог</p>
    <div class="nav_menu_list">
    <div class="nav_menu_list_item"><a href="/catalog_1" class="nev_item">Apple</a></div>
    <div class="nav_menu_list_item"><a href="/catalog_2" class="nev_item">Samsung</a></div>
    <div class="nav_menu_list_item"><a href="/catalog_3" class="nev_item">HONOR</a></div>
    <div class="nav_menu_list_item"><a href="/catalog_4" class="nev_item">Huawei</a></div>
    <div class="nav_menu_list_item"><a href="/catalog_5" class="nev_item">OnePlus</a></div>
    <div class="nav_menu_list_item"><a href="/catalog_6" class="nev_item">Google Pixel</a></div>
    
    </div>
    </div>
    </div>
    
    <form class="find" method="get" action="./search">
        <input class="find_item" type="text" onfocus="this.value=''" value="Поиск по товарам" name="query">
        <div><button type="submit_1">Поиск</button></div>
    </form>
    </div>



    <div class="menu_right_main">
        <a href="#" sec:authorize="isAuthenticated()">
            <div class="menu_right_main_item">
                <img src="img/войти.png" alt="">
                <div class="header_item_text" sec:authentication="name"></div>
            </div>
        </a>
        <a href="/logout" sec:authorize="isAuthenticated()">
            <div class="menu_right_main_item">
                <img src="img/door.png" alt="">
                <div class="header_item_text">Выйти</div>
            </div>
        </a>
        <a href="/login" sec:authorize="!isAuthenticated()">
            <div class="menu_right_main_item">
                <img src="img/войти.png" alt="">
                <div class="header_item_text">Войти</div>
            </div>
        </a>
        <a href="favorites">
            <div class="menu_right_main_item">
                <img src="img/избранное.png" alt="">
                <div class="header_item_text">Избранное</div>
            </div>
        </a>
        <a href="/basket">
            <div class="menu_right_main_item">
                <img src="img/корзина.png" alt="">
                <div class="header_item_text">Корзина</div>
            </div>
        </a>
    </div>

    `
}


function fillFooter() {
    let Container = document.querySelector(".footer");
    Container.innerHTML = `
    <div class="main_footer">
    
    
    <div class="contacts">
    
    <div class="main_contacts">
    <p class="test_item">Контакты</p>
    <p><a href="">Адреса магазинов</a></p>
    <p><a href="">+7(968)-608-64-54</a></p>
    <p>Москва</p>
    <div class="main_contacts_links">
    <a href=""><img src="img/vk.png" alt=""></a>
    <a href=""><img src="img/telegram.png" alt=""></a>
    <a href=""><img src="img/YOUTUBE.png" alt=""></a>
    <a href=""><img src="img/TWITTER.png" alt=""></a>
    <a href=""><img src="img/Facebook.png" alt=""></a>
    </div>
    </div>
    
    <div class="menu_contacts">
    <div class="menu_contacts_item">
    
    <p><a href="">Акции</a></p>
    <p><a href="">Информация</a></p>
    <p><a href="">Доставка</a></p>
   
  
    
    
    </div>
    <div class="menu_contacts_item">
    <p><a href="">Сервисные центры</a></p>
    <p><a href="">Услуги</a></p>
    <p><a href="">Обзоры</a></p>
    </div>
    <div class="menu_contacts_item">
    <p><a href="">Новости</a></p>
    <p><a href="">Клуб</a></p>
    <p><a href="">Вакансии</a></p>
    </div>
    
    </div>
    </div>
    
    
    <div class="bottom_footer">
    <div class="bottom_footer_line">
    <p>Курсовая работa Сущева Родиона</p>
    <p class="bottom_footer_line_year">2022</p>
    </div>
    </div>
    </div>
    
    
    `
}

