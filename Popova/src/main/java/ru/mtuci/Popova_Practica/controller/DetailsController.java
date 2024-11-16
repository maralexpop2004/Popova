package ru.mtuci.Popova_Practica.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.Popova_Practica.model.Demo;
import ru.mtuci.Popova_Practica.model.Details;
import ru.mtuci.Popova_Practica.repository.DetailsRepository;
import ru.mtuci.Popova_Practica.service.DemoService;

@RestController
@RequestMapping("/details")
@RequiredArgsConstructor
public class DetailsController {

    private final DetailsRepository detailsRepository;
    private final DemoService demoService;

    @PostMapping("/{demo_id}/save")
    public void save(@PathVariable(value = "demo_id") Long demoId,
                     @RequestBody Details details) {
        Demo demo = demoService.findById(demoId);
        details.setDemo(demo);
        detailsRepository.save(details);
    }
}