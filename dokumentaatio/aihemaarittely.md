## Aihemäärittely

### Aihe: Lajittelurobotti

Toteutetaan robotti, joka lajittelee liukuhihnalla kulkevia lego-palikoita niiden värin mukaisesti. Samankaltainen toteutus löytyy [videolta](https://youtu.be/0CeW-zBc0lQ?t=79) vuoden 2015 Robolabrassa tehdyistä töistä.

Lego-palikoiden tulisi kulkea liukuhihnalla seuraavasti (hahmotelma alla):
1. Palikka lisätään liukuhinalle sen toisesta aloituspäästä.
2. Palikan väri tarkistetaan valosensorilla. 
3. Valosensorin jälkeen oleva liikkuva ohjain lajittelee eri väriryhmiin kuuluvat palikat eri liukuhihnoille oikealle tai vasemmalle.
4. Kun palikka on lajiteltu, voidaan ottaa käsittelyyn seuraava palikka.

![Liukuhihna](/dokumentaatio/Liukuhihna.png "Liukuhihna")

Väriryhmiä on kaksi ja eri värit jaotellaan niihin valosensorin havaitseman intensiteetin perusteella.
Oikeanlaisen lajittelun varmistamiseksi liukuhinhalla voi kulkea vain yksi palikka kerrallaan, mutta perustoiminnallisuuden toteutuksen jälkeen voidaan lisätä palikoiden kulkua tarkkailevia ja rajoittavia toimintoja.