package academy.kata.mis.misfeigntest.feign;

import academy.kata.mis.misfeigntest.model.dto.appeal.AppealToReportServiceDTO;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;
import static academy.kata.mis.misfeigntest.feign.MedicalFeignClient.MedicalServiceFallbackFactory;
@FeignClient(name = "medical-service", fallbackFactory = MedicalServiceFallbackFactory.class)
public interface MedicalFeignClient {

    @GetMapping("/internal/medical/patient/appeal/report")
    AppealToReportServiceDTO getAppealToReport(@RequestParam(name = "patient_id") Long patientId,
                                               @RequestParam(name = "appeal_id") Long appealId,
                                               @RequestParam(name = "currentUserId") UUID userId);


    @Component
    class MedicalServiceFallbackFactory implements FallbackFactory<MedicalFeignClient> {

        @Override
        public FallbackWithFactory create(Throwable cause) {
            return new FallbackWithFactory(cause.getMessage());
        }
    }

    record FallbackWithFactory(String reason) implements MedicalFeignClient {

        @Override
        public AppealToReportServiceDTO getAppealToReport(Long patientId, Long appealId, UUID userId){
            String responseMessage = """
                    Ошибка с параметрами patientId=%s ; appealId=%s ; userId=%s; message: %s
                    """.formatted(patientId, appealId, userId, reason);

            throw new RuntimeException(responseMessage);
        }
    }
}
