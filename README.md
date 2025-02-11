
# Лабараторна 4
Тема: Масиви
----
В даній лабораторній реалізовано програму, в якій обчисленно три завдання

Завдання 1 

У цьому завданні клас task_1 отримує масив чисел arr і обчислює різницю між 
максимальним і мінімальним елементами даного масиву.

Завдання 2 

У цьому завданні клас task_2 також отримує масив чисел arr і обчислює різницю 
між максимальним і другим за величиною значеннями цього масиву.

Завдання 3 

У цьому завданні клас task_3 отримує масив чисел arr і виконує наступні дії:
Якщо мінімальне значення масиву не дорівнює нулю, то кожен елемент масиву ділиться на мінімальне значення.
Якщо мінімальне значення масиву дорівнює нулю, то всі елементи масиву замінюються на -10.

# Контрольні питання 

1. Змінна - це контейнер для зберігання одного значення певного типу даних.
Масив - це структура даних, що складається з послідовно розташованих у пам'яті елементів, які можуть бути одного типу.
2. Стек - це структура даних, у якій доступ до елементів здійснюється за принципом "останній увійшов, перший вийшов" .
   Купа  - це частина пам'яті, де розташовуються об'єкти, які можуть бути динамічно виділені та звільнені в програмі.
3. Стек: Змінні розміщуються у стеку. Масиви можуть знаходитися у купі або можуть мати посилання на область пам'яті в купі.
   Купа: Зазвичай об'єкти (в тому числі масиви) розміщуються у купі.
4. Масив - це самостійна структура даних, тоді як посилання на масив це посилання на область пам'яті, де знаходиться масив. Посилання може бути розміщено у стеку або купі.
5. Якщо масив складається з 10 елементів, то перший індекс буде 0, а останній - 9 (якщо індексація починається з 0).
6. Звернення до неіснуючої комірки викличе помилку в програмі, оскільки вона не існує в області пам'яті, призначеній для масиву.
7. Зазвичай всі комірки нового масиву ініціалізуються значеннями за замовчуванням для цього типу даних.
8. Номер першої комірки завжди 0, останньої - на одиницю менше від загального розміру масиву.
9. У багатьох мовах програмування можливе змінення розміру масиву (динамічна зміна розміру), але відбувається це дещо по-різному в залежності від мови.
10. При копіюванні посилання на масив створюється нове посилання на ту саму область пам'яті, де знаходиться масив.
11. При втраті посилання на масив доступ до самого масиву залишається можливим, але не знаючи посилання, важко отримати до нього доступ.
12. for дозволяє працювати з індексами елементів масиву, тоді як for-each перебирає всі елементи масиву без прямого доступу до індексів.
    Кожен з цих підходів має свої переваги та недоліки: for - більше контролю, for-each - простота використання.
13. Зазвичай неможливо записати значення іншого типу у масив, ніж він визначений. Наприклад, у масив типу double[] не можна записати значення типу int, і навпаки.