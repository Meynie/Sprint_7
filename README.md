# Sprint_7

API учебного сервиса [Яндекс.Самокат](http://qa-scooter.praktikum-services.ru/).

Его [документация](qa-scooter.praktikum-services.ru/docs/.).

### Выполненные кейсы:

#### 1. Создание курьера 
1. курьера можно создать;
2. нельзя создать двух одинаковых курьеров;
3. чтобы создать курьера, нужно передать в ручку все обязательные поля;
4. запрос возвращает правильный код ответа;
5. успешный запрос возвращает ok: true;
6. если одного из полей нет, запрос возвращает ошибку;
7. если создать пользователя с логином, который уже есть, возвращается ошибка.

#### 2. Логин курьера
1. курьер может авторизоваться;
2. для авторизации нужно передать все обязательные поля;
3. система вернёт ошибку, если неправильно указать логин или пароль;
4. если какого-то поля нет, запрос возвращает ошибку;
5. если авторизоваться под несуществующим пользователем, запрос возвращает ошибку;
6. успешный запрос возвращает id.

#### 3. Создание заказа
1. можно указать один из цветов — BLACK или GREY;
2. можно указать оба цвета;
3. можно совсем не указывать цвет;
4. тело ответа содержит track.

#### 4. Список заказов
1. в теле ответа возвращается список заказов.
