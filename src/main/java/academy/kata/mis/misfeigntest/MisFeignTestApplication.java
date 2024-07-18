package academy.kata.mis.misfeigntest;

import academy.kata.mis.misfeigntest.model.dto.appeal.AppealToReportServiceDTO;
import academy.kata.mis.misfeigntest.service.FeignServiceAppImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class MisFeignTestApplication {
    static FeignServiceAppImpl feignServiceApp;

    @Autowired
    public MisFeignTestApplication(FeignServiceAppImpl feignServiceApp) {
        this.feignServiceApp = feignServiceApp;
    }

    public static void main(String[] args) {
        SpringApplication.run(MisFeignTestApplication.class, args);
        Long patientId = 1L;
        Long appealId = 3L;
        UUID userId = UUID.fromString("31c2cd49-939a-4227-ae8e-c95b0a4456b6");

        AppealToReportServiceDTO dto0 = feignServiceApp.getMedicalFeignClient().getAppealToReport(patientId, appealId, userId);
//        System.out.println(dto0);
        System.out.println("HASH----");
        System.out.println(dto0.hashCode());

        AppealToReportServiceDTO dto1 = feignServiceApp.getMedicalFeignClient().getAppealToReport(patientId, appealId, userId);
//        System.out.println(dto1);
        System.out.println("HASH----");
        System.out.println(dto1.hashCode());

        AppealToReportServiceDTO dto2 = feignServiceApp.getMedicalFeignClient().getAppealToReport(patientId, appealId, userId);
//        System.out.println(dto2);
        System.out.println("HASH----");
        System.out.println(dto2.hashCode());

        AppealToReportServiceDTO dto3 = feignServiceApp.getMedicalFeignClient().getAppealToReport(patientId, appealId, userId);
//        System.out.println(dto3);
        System.out.println("HASH----");
        System.out.println(dto3.hashCode());

    }
}
