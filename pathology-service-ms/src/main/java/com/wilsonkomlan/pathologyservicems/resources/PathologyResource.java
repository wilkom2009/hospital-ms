package com.wilsonkomlan.pathologyservicems.resources;

import java.util.Arrays;
import java.util.List;

import com.wilsonkomlan.pathologyservicems.models.Disease;
import com.wilsonkomlan.pathologyservicems.models.DiseasesList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

    static List<Disease> fackeDiseases = Arrays.asList(new Disease("D1", "Rhume", "Eau chaude"),
            new Disease("D2", "Asthme", "Gaz En boite"), new Disease("D3", "VIH", "Medicament ARV"),
            new Disease("D4", "Paludisme", "Plante Artemisia"), new Disease("D5", "Diarhee", "Orassel"));

    @GetMapping("/diseases")
    public DiseasesList getDiseases() {
        DiseasesList diseasesList = new DiseasesList();
        diseasesList.setDiseases(fackeDiseases);
        return diseasesList;
    }

    @GetMapping("/diseases/{id}")
    public Disease getDiseaseById(@PathVariable("id") String id) {
        return fackeDiseases.stream().filter(d -> id.equals(d.getId())).findAny().orElse(null);

    }
}
