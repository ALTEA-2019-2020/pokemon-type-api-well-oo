# pokemon-type-api-well-oo

## But du projet
API permettant de représenter un pokémon sous format JSON

## Lancer l'application
Pour lancer l'application, il suffit d'exécuter la commande suivante:
```
mvn clean install && mvn spring-boot:run
```
L'application sera accessible via l'url http://localhost:8080/  

Routes disponibles:
- http://localhost:8080/pokemon-types/ : retourne  tous les pokémons
- http://localhost:8080/pokemon-types/25 : retourne le pokémon avec l'identifiant 25
- http://localhost:8080/pokemon-types/?name=pikachu : retourne Pikachu
- http://localhost:8080/pokemon-types/?types=bug,poison : retourne les pokémons possédant les types insecte et poison

## Exécuter les tests
Pour exécuter les tests, utiliser la commande suivante:
```
mvn test
```

## Déploiement
L'application n'a pas été déployé

## Annexes
Un swagger a été mis en place et est accessible via l'url http://localhost:8080/swagger-ui.html#/  
Des tests postman sont disponibles dans le fichier `src/test/resources/pokemon-type-api.postman_collection.json`

## Auteur

Christopher DUCROCQ [@well-oo](https://github.com/well-oo)  
Etudiant en Master 2 MIAGE FA