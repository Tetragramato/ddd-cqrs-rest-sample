ddd-cqrs-rest-sample : WORK IN PROGRESS
=======================================

This is juste an example of CQRS applied to DDD with Spring REST and Hateoas.
Inspired by [https://github.com/BottegaIT/ddd-cqrs-sample](ddd-cqrs-sample) and work of Greg Young.

Requis : JAVA 8

Test de l'application
=====================
Lancement de l'application via Spring Boot (AppConfig)

URL
---
http://localhost:8080/adresses
http://localhost:8080/adresses/{id}

Méthodes autorisées
-------------------
- GET
- POST
- PATCH

pour le Partial Update via le PATCH :
-------------------------------------
{
"id":"269c1ea0-ffc6-11e3-9191-0800200c9a66",
"ligneAdresse":"toto",
"ville":"nimes",
"command":"AdresseUpdateLigneCommand"
}

les commandes peuvent être :
- AdresseCreateCommand
- AdresseUpdateAllCommand
- AdresseUpdateLigneCommand

