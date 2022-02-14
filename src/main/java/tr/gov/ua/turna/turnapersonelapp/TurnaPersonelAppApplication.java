package tr.gov.ua.turna.turnapersonelapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.ua.turna.turnapersonelapp.entity.Personel;
import tr.gov.ua.turna.turnapersonelapp.repository.PersonelRepository;

@SpringBootApplication
public class TurnaPersonelAppApplication implements CommandLineRunner {

    @Autowired
    private PersonelRepository personelRepository;

    public static void main(String[] args) {
        SpringApplication.run(TurnaPersonelAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Personel personel1 = new Personel();
        personel1.setAd("Aziz");
        personel1.setSoyad("Sancar");
        personel1.setMaas(10000);

        Personel personel2 = new Personel();
        personel2.setAd("Uğur");
        personel2.setSoyad("Şahin");
        personel2.setMaas(20000);

        Personel personel3 = new Personel();
        personel3.setAd("Oktay");
        personel3.setSoyad("Sinanoğlu");
        personel3.setMaas(5000);

        personelRepository.save(personel1);
        personelRepository.save(personel2);
        personelRepository.save(personel3);

    }
}
