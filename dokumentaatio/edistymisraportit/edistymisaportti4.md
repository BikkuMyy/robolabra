## Viikkoraportti 4

Tuntimäärä ~8h

Kuluneella viikolla ei edistystä tapahtunut yhtä paljon kuin edellisviikon harppauksissa. Tällä viikolla aikaa kului enemmän koodikatselmointiin sekä testaus- ja toteutusdokumenttien kirjoittamiseen kuin ohjelmointiin.

Ohjelma kuitenkin edistyi suunnitelman mukaan - liukuhihnan ohjain kääntyy oikealle tai vasemmalle valosensorin lukeman perusteella, jolloin eriväriset palikat lajitellaan eri liukuhihnoille. Tällä hetkellä lajittelu ei kuitenkaan toimi vielä täysin luotettavasti - samanvärinen palikka saattaa päätyä eri puolille. Tämä näkyy myös [videolta](https://www.dropbox.com/s/jcktb20et3ykc7r/File%208.1.2018%2018.47.58.mov?dl=0), kun kaksi punaista palikkaa lajitellaan eri puolille. Ohjelmassa esiintyy myös välillä bugi, jossa käynnistettäessä liukuhihna ei pyöri normaalisti vaan pysähtelee jatkuvasti, vaikka liukuhihnalla ei ole mitään. Muita haasteita ei tällä viikolla oikeastaan ollut.


Seuraavalla viikolla suunnitelmissa refaktorointia ensimmäisesta koodikatselmoinnista saadun palautteen perusteella ja koittaa selvittää, mistä em. bugi voisi johtua. Lisäksi eriväristen palikoiden lajittelua täytyy tarkentaa.