# hello-world-demo

Демонстрационный проект для экспериментов с Docker. Для запуска проекта необходимо установить на своей машине следующие инструменты:

| Recommended | Reference |
| ----------- | --------- |
| Oracle Java 11 JDK | [Download](https://www.oracle.com/java/technologies/downloads/#java11) |
| Maven 3.6.0 или выше | [Download](https://maven.apache.org/download.cgi) |
| Docker Personal | [Download](https://www.docker.com/products/personal/) |
| Git 2.15 или выше | [Download](https://git-scm.com/downloads) |

### Клонирование, сборка и запуск

Клонирование
```
git clone https://github.com/javajuniorlevelup/hello-world-demo.git
```
Перед запуском docker-а необходимо собрать проект с помощью maven и получить артефакт HelloDemo-0.0.1-SNAPSHOT.jar, который мы и упакуем в docker образ.
```
cd hello-world-demo
mvn clean package
```
После этого у нас появляется возможность либо собрать образ и дать ему имя:
```
docker build -t hello-demo .
```
После чего запустить
```
docker run -it -p 8080:8080 hello-demo
```
Либо воспользоваться docker-compose:
```
docker-compose up
```
После этого проверяем сообщение в терминале о том, что контейнер успешно запущен и переходим по ссылке 
[http://localhost:8080/hello/John](http://localhost:8080/hello/John). Если все хорошо, мы увидим сообщение Hello, John.
