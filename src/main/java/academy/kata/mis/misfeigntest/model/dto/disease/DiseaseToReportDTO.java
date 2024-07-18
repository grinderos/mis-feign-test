package academy.kata.mis.misfeigntest.model.dto.disease;

import lombok.Builder;

@Builder
public record DiseaseToReportDTO(Long id, String name) {
}
