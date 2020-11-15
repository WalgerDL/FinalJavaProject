ЗАПРОС БАЛАНСА(рабочая версия)

Пакеты:

Клиент(user)
Банкомат(atm)
Процесинговый сервер(processingServer)

Классы:

user package:
Клиент(UserID)
Номер карты(PANofCard)
Срок действия(ExpDate)
Пин-код(Password)

atm package:
Средство ввода(KeyBoard)
Проверка данных(ClientID)
Передача+запрос данных сервер(TransferData) // придётся разделить?
Поиск данных на сервере(FindData)
Получение данных и вывод на экран(DisplayData) // придётся разделить?

processingServer package:
Сервер(ProcessingServer_enum) // enum?
      (ProcessingServer)






