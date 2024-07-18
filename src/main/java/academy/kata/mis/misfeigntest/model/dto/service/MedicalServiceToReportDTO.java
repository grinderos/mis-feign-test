package academy.kata.mis.misfeigntest.model.dto.service;

import lombok.Builder;

@Builder
public record MedicalServiceToReportDTO(Long id,
                                        String name,
                                        Long medicalServiceDepId,
                                        Long visitId) {
}