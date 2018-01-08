## Toteutusdokumentti

### Ohjelman rakenne

Ohjelman tämänhetkista rakennetta kuvaa alla oleva luokkakaaviossa:

![Luokkakaavio](/dokumentaatio/Luokkakaavio.png "Luokkakaavio")

Main-metodissa luotu Sorter-olio käyttää konstruktorin parametreina saamiaan BeltController-, ColorReader- ja Director-olioiden toiminnallisuutta lajittelurobotin hallinnassa. Nimiensä mukaisesti BeltController hallitsee liukuhihnan toimintaa, ColorReader on vastuussa palikoiden värin määrittämisestä ja Director liikuttaa palikoita lajittelevaa ohjainta.

### Erikoisuudet ja vaatimukset
Ohjelmisto on toteutettu Lego Mindstorms NXT-robotille Javalla käyttäen leJOS-firmwaren versiota 0.9.0.

### Puutteet ja parannusehdotukset
Rakenteellisesti liukuhihnat voisivat olla leveämpiä, jotta palikat kulkisivat niillä sujuvammin. Toteutuksen aikana mietittiin myös palikoiden syöttämisen kontrollointia/automatisointia.

### Lähteet
[Samankaltainen toteutus videolla](https://youtu.be/0CeW-zBc0lQ?t=79)
[LeJOS API](http://www.lejos.org/nxt/nxj/api/index.html)