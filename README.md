# poc_kafka
Preuve de concept du projet BIOllca mettant en oeuvre la communication entre micro-services via Kafka.

# Installation
```
$ docker-compose up -d
```

Le micro-service ms1 publie une donnée sur le topic de Kafka. (Publisher)
Le micro-service ms2 lit les données publiées par ms1 et les affiche. (Consumer)