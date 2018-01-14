## Robottiohjelmoinnin harjoitustyö: Lajittelurobotti

Lajittelurobotti lajittelee liukuhihnalla kulkevia lego-palikoita niiden värin mukaisesti. [Katso](https://www.dropbox.com/s/vsh96c9fxojkvdj/MVI_7978.MOV?dl=0) viimeisin video robotin toiminnasta.

### Dokumentaatio
* [Aihemäärittely](dokumentaatio/aihemaarittely.md)
* [Edistymisraportit](dokumentaatio/edistymisraportit)
* [Testausraportti](dokumentaatio/testausdokumentti.md)
* [Toteutusraportti](dokumentaatio/toteutusraportti.md)

### Käyttöohje
Lajittelurobotti käynnistyy, kun ohjelma ajetaan ja pysähtyy NXT Brickin oranssista napista. Ennen kuin robotti voi alkaa lajitella palikoita, täytyy sen ensin kalibroida itsensä, kuten Brickin näytölle käynnistettäessä tulostuu. Näytölle tulee tulostua normaaliarvo, lajittelun raja-arvo ja "Done!..", jonka jälkeen robotti on valmis lajittelemaan. Palikoita syötetään lajiteltavaksi hihnan alkupäästä (punainen nuoli) ja ne lajitellaan kahteen eri lokeroon hinhan loppupäähän. Lajittelu perustuu valosensorin lukemaan arvoon ja normaaliarvosta riippuvaan rajaan. Lajittelu ei ole luotettavaa, mikäli ensimmäisellä liukuhihnalla liikkuu usempi palikka yhtä aikaa. 
