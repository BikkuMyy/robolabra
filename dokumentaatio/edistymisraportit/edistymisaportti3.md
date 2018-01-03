## Viikkoraportti 3

Tuntimäärä ~15 h

Kolmannella viikolla robotti otti suuren edistysaskeleen rakenteessaan, toiminnallisuus tulee hieman jäljessä. Liukuhihnalle lisättiin sekä valosensori palikoiden värien määrittämistä varten että toinen moottori ohjaimen kääntämiseen. Ohjaimen kääntäminen palikan värin perusteella jäi tehtäväksi ensi viikolla.

Valosensorin lisäämisen ansiosta koodin rakennetta piti miettiä uudelleen niin, että on olemassa yksi luokka joka ns. pyörittää koko liukuhihnaa ja siihen liittyviä toimintoja. Tällä viikolla ohjelmointi oli aiemmin mainittua build-kummallisuutta lukuun ottamatta suhteellisen sujuvaa. Päänvaivaa tuottivat eniten liukuhihnan pysäyttäminen ja valosensorin arvon lukeminen kun palikka on sensorin kohdalla. Koska valosensori osoittaa alaspäin liikkuvalle liukuhihnalle, oli haasteellista löytää sopiva tapa "päättää", milloin muutos sensorin arvossa on tarpeeksi suuri. Sen sijaan, että hihna pysähtyy kokonaan, voisi myös harkita vaihtoehtoa, jossa sen vauhti hidastuu huomattavasti, jos sensorin alla on palikka.

Kuten sanottua, seuraavan viikon tavoitteena on lisätä toiminnallisuutta niin, että myös toinen moottori toimii ja ohjain kääntyy eri suuntiin hallitusti. Sen jälkeen ohjaimen ja valosensorin yhteistoiminnan sujuvuutta tulisi myös testata erivärisillä, -kokoisilla ja -muotoisilla palikoilla, jos mahdollista.