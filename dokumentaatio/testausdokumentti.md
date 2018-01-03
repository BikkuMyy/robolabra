## Testausdokumentti

### Vaihe 1
Testataan lajittelurobotin liukuhihnojen perustoiminnallisuutta. Robotin kaikkien liukuhihnojen tulisi liikkua samalla nopeudella eteenpäin, kunnes ne pysäytetään hetkellisesti tai kokonaan. Palikoiden siirtymisen tulee olla mahdollista liukuhihnalta toiselle manuaalisen ohjaimen ohjaamana niin, että ne edelleen liikkuvat hihnalla ohjaamisen jälkeen, eivätkä tipu. Ensimmäisen vaiheen testauksesta kuvattiin [video](https://www.dropbox.com/s/6gfreld1poeap2l/File%2028.12.2017%2023.41.34.mov?dl=0), jolla nähdään, että liukuhihna toimii tällä hetkellä vaatimusten mukaisesti.

### Vaihe 2
Testataan lajittelurobotin liukuhihnalle lisätyn valosensorin toimintaa. Kun liukuhinalle lisätään palikka, tulisi hinan pysähtyä, kun se tulee valosensorin kohdalle. Valosensorin tulisi määrittää palikalle arvo sen värin perustella ja arvon tulisi tulostua NXT Brickin näytölle. Määrityksen jälkeen liukuhihna kuljettaa palikkaa jälleen eteenpäin ja liukuhihnalle voidaan lisätä toinen palikka.