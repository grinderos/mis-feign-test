package academy.kata.mis.misfeigntest.service;


import academy.kata.mis.misfeigntest.feign.MedicalFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceAppImpl {

    private final MedicalFeignClient medicalFeignClient;

    @Autowired
    public FeignServiceAppImpl(MedicalFeignClient medicalFeignClient) {
        this.medicalFeignClient = medicalFeignClient;
    }

    public MedicalFeignClient getMedicalFeignClient() {
        return medicalFeignClient;
    }
}
