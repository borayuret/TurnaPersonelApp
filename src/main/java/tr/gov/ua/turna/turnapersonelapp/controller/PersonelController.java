package tr.gov.ua.turna.turnapersonelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.gov.ua.turna.turnapersonelapp.entity.Personel;
import tr.gov.ua.turna.turnapersonelapp.repository.PersonelRepository;

import java.util.List;

@RestController
public class PersonelController {

    @Autowired
    private PersonelRepository personelRepository;

    @GetMapping("/personel")
    public List<Personel> getTumPersonel()
    {
        return personelRepository.findAll();
    }

}
