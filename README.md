# poc_kafka
Preuve de concept du projet BIOllca mettant en oeuvre la communication entre micro-services via Kafka.

## Installation (Kafka + les micro-services)
```
$ docker-compose up -d
```

Le micro-service ms1 publie une donnée sur le topic de Kafka. (Publisher)

Le micro-service ms2 lit les données publiées par ms1 et les affiche. (Consumer)


#### URL MS1 : `http://localhost:8080/api`

#### URL MS2 : `http://localhost:8081/api`

## Utilisation

Une collection postman est disponible dans le fichier `PoC_Kafka.postman_collection.json`

Une fois importée, il faudra exécuter au minimum les requêtes suivantes dans cet ordre :

- `POST (ms1) /send` : Pour la publication d'un message dans le topic Kafka "myTopic".
- `GET (ms2) /get` : Pour la récuperation du message qui a été écouté par un listener lors de la publication du message.

Le message circulera dans un DTO où sera aussi stocké un datetime de la publication du message.