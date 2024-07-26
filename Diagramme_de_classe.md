```mermaid

---
title : Brief 09 - Conception UML pour Nebula Game Labs
---

classDiagram


    Village_Main "1" <--> "0." Batiment
    Village_Main "1" <--> "0." Ressource
    Village_Main "1" <--> "0." Unite

    Batiment <..> Constructible
    Batiment <|-- Atelier
    Batiment <|-- Caserne
    Batiment <|-- Ferme
    Batiment <|-- Maison
    Batiment <|-- Mur_de_defense

    Ressource <..> Collectable
    Ressource <|-- Bois
    Ressource <|-- Nourriture
    Ressource <|-- Pierre

    Unite <|.. Activite
    Unite <|-- Artisan
    Unite <|-- Villageois
    Unite <|-- Soldat
    Unite <|-- Chef
    Unite <|-- Eclaireur

    Villageois <--> Maison : se reposer
    Eclaireur <--> Maison : se reposer
    Artisan <--> Maison : se reposer
    Artisan <--> Batiment : ameliorer
    Artisan <--> Atelier
    Villageois <--> Ressource

    class Village_Main{
    }

    namespace Batiments {
        class Batiment
        class Atelier
        class Caserne
        class Ferme
        class Maison
        class Mur_de_defense
        class Constructible
    }

    class Batiment {
        <<Abstract>>
    }

    class Constructible {
        <<Interface>>
        + construire()
    }

    class Atelier {
    }

    class Caserne {   
    }

    class Ferme {
    }

    class Maison {
    }

    class Mur_de_defense {
    }

    namespace Ressources {
        class Ressource
        class Bois
        class Nourriture
        class Pierre
        class Collectable
    }

    class Ressource {
        <<Abstract>>
    }

    class Collectable {
        <<Interface>>
        + collecter()
    }

    class Bois{
    }

    class Nourriture {
        + fruits
        + légumes
    }

    class Pierre{
    }

    namespace Unites {
        class Unite
        class Villageois
        class Artisan
        class Eclaireur
        class Chef
        class Soldat
        class Activite
    }

    class Unite {
        <<Abstract>>
        + nom

    }

    class Activite {
        <<Interface>>
        + seReposer(maison)
        + move()
        + voguer()
    }

    class Villageois {
        + recolter()
    }

    class Soldat {
        + LieuType : etat
    }

    class Chef {
    }

    class Artisan {
        + produireDesOutils()
        + produireDesArmes()
        + ameliorerBatiments()
    }

    class Eclaireur {
        + partirEnExploration()
    }

    style Batiment stroke:cyan,stroke-width:3px
    style Maison stroke:cyan,stroke-width:3px
    style Ferme stroke:cyan,stroke-width:3px
    style Caserne stroke:cyan,stroke-width:3px
    style Mur_de_defense stroke:cyan,stroke-width:3px
    style Atelier stroke:cyan,stroke-width:3px
    style Constructible stroke:cyan,stroke-width:3px, stroke-dasharray: 5 5

    style Ressource stroke:orange,stroke-width:3px
    style Bois stroke:orange,stroke-width:3px
    style Pierre stroke:orange,stroke-width:3px
    style Nourriture stroke:orange,stroke-width:3px
    style Collectable stroke:orange,stroke-width:3px, stroke-dasharray: 5 5

    style Unite stroke:red,stroke-width:3px
    style Artisan stroke:red,stroke-width:3px
    style Chef stroke:red,stroke-width:3px
    style Eclaireur stroke:red,stroke-width:3px
    style Soldat stroke:red,stroke-width:3px
    style Villageois stroke:red,stroke-width:3px
    style Activite stroke:red,stroke-width:3px, stroke-dasharray: 5 5

   





    