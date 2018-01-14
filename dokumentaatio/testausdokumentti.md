## Testausdokumentti

### Vaihe 1
Testataan lajittelurobotin liukuhihnojen perustoiminnallisuutta. Robotin kaikkien liukuhihnojen tulisi liikkua samalla nopeudella eteenpäin, kunnes ne pysäytetään hetkellisesti tai kokonaan. Palikoiden siirtymisen tulee olla mahdollista liukuhihnalta toiselle manuaalisen ohjaimen ohjaamana niin, että ne edelleen liikkuvat hihnalla ohjaamisen jälkeen, eivätkä tipu. Ensimmäisen vaiheen testauksesta kuvattiin [video](https://www.dropbox.com/s/6gfreld1poeap2l/File%2028.12.2017%2023.41.34.mov?dl=0), jolla nähdään, että liukuhihna toimii tällä hetkellä vaatimusten mukaisesti.

### Vaihe 2
Testataan lajittelurobotin liukuhihnalle lisätyn valosensorin toimintaa. Kun liukuhinalle lisätään palikka, tulisi hihnan pysähtyä, kun se tulee valosensorin kohdalle. Valosensorin tulisi määrittää palikalle arvo sen värin perustella ja arvon tulisi tulostua NXT Brickin näytölle. Määrityksen jälkeen liukuhihna kuljettaa palikkaa jälleen eteenpäin ja liukuhihnalle voidaan lisätä toinen palikka. Toisen vaiheen testauksesta kuvattiin [video](https://www.dropbox.com/s/mchb3pmm52nt5f5/MVI_7975.MOV?dl=0), jolta nähdään, että valosensori toimii tämänhetkisten vaatimusten mukaisesti.

### Vaihe 3
Kun ohjaimen toiminnallisuus on toteutettu, testataan palikoiden sujuvaa kulkua liukuhihnalla sekä niiden oikeanlaista lajittelua värin perusteella (aihemäärittelyn mukaisesti). Kuten [videolta](https://www.dropbox.com/s/jcktb20et3ykc7r/File%208.1.2018%2018.47.58.mov?dl=0) nähdään, robotti ei vielä toimi vaatimusten mukaisesti, vaan on mahdollista, että kaksi samanväristä palikkaa voi lajittelussa päätyä eri puolille. Lajittelulogiikka on myös hieman kyseenalainen - tummien eli mustien ja sinisten palikoiden tulisi päätyä samalle puolelle, mutta nyt ne lajitellaan eri puolille.

### Vaihe 4
Kunhan lajittelua on saatu korjattua luotettavammaksi, testataan palikoiden lajittelua perusteellisesti - samanväristen palikoiden tulisi aina päätyä samalle puolelle ja tummien/vaaleiden omille osastoilleen. Edistymisraportissa 5 mainittujen muutosten vaikutuksia testattiin ja nyt samanväriset ja palikat päätyvät aina samalle puolelle, kuten [videolta](https://www.dropbox.com/s/vsh96c9fxojkvdj/MVI_7978.MOV?dl=0) huomataan. Valosensori antaa väreille niiden sävyistä riippumattomia arvoja, jolloin esimerkiksi valkoisella, punaisella ja keltaisella värillä voi olla sama arvo valaistuksesta riippuen, joten lajittelu värisävyn perusteella ei aina ole luotettavaa.
