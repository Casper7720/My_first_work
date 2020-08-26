## Замечания

### Git

Когда создаешь новый проект не забывай добавлять .gitignore, можешь его сгенерировать здесь - 
[gitignore.io](https://www.toptal.com/developers/gitignore)

### Оформление

Нельзя кидать свои классы сразу в папку src. Тебе нужно сначала создать пакет, например com.casper.lab1 
(com.casper - groupId, lab1 - artifactId).

Юзай почаще хоткей в idea ctrl+alt+l

### Сингальтоны

Использовать статики в сингальтоноварении не очень хорошая идея. Такие сингальтоны скорее анти-паттерн. 

Вот классная статья на хабре по созданию сингальтонов в Java - [Habr](https://habr.com/ru/post/129494/)

Из этой статьи мне нравятся Enum Singleton (для небольших классов этот вариант лучший) и 1 Static field

P.s. Вообще говоря все эти сингальтоны (кроме Enum Singleton в какой-то степени) анти-паттерны, т.к. такие реализации 
очень трудно тестировать

### Main

В main лучше много кода не писать. Такой стиль предпочтительней:

```java
public class Main implements Runnable {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        // code here...
    }
}
```

