package com.wilsonkomlan.admissionservicems.resources;

import java.util.Arrays;
import java.util.List;

import com.wilsonkomlan.admissionservicems.models.DiseasesList;
import com.wilsonkomlan.admissionservicems.models.EmployeesList;
import com.wilsonkomlan.admissionservicems.models.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {

    static List<Patient> fakePatients = Arrays.asList(new Patient("P1", "Abalo", "Togolese"),
            new Patient("P2", "Massan", "Gabonese"), new Patient("P3", "Emy", "American"));

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/physicians")
    public EmployeesList getPhysicians() {
        return restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
    }

    @GetMapping("/diseases")
    public DiseasesList getDiseases() {
        return restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return fakePatients;
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable("id") String id) {
        return fakePatients.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
    }
}
