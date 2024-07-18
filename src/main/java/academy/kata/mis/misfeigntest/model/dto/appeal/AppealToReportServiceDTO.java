package academy.kata.mis.misfeigntest.model.dto.appeal;

import academy.kata.mis.misfeigntest.model.dto.disease.DiseaseToReportDTO;
import academy.kata.mis.misfeigntest.model.dto.visit.VisitToReportDTO;
import academy.kata.mis.misfeigntest.model.enums.AppealStatus;
import academy.kata.mis.misfeigntest.model.enums.InsuranceType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record AppealToReportServiceDTO(Long appealId,
                                       AppealStatus appealStatus,
                                       InsuranceType insuranceType,
                                       LocalDate openDate,
                                       LocalDate closedDate,
                                       DiseaseToReportDTO disease,
                                       Long patientPersonId,
                                       List<VisitToReportDTO> visits) {
}