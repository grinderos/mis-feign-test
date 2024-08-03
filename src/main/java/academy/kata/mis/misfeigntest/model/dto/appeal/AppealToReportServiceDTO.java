package academy.kata.mis.misfeigntest.model.dto.appeal;

import academy.kata.mis.misfeigntest.model.dto.disease.DiseaseToReportDTO;
import academy.kata.mis.misfeigntest.model.dto.visit.VisitToReportDTO;
import academy.kata.mis.misfeigntest.model.enums.AppealStatus;
import academy.kata.mis.misfeigntest.model.enums.InsuranceType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Builder
public record AppealToReportServiceDTO(Long appealId,
                                       AppealStatus appealStatus,
                                       InsuranceType insuranceType,
                                       LocalDate openDate,
                                       LocalDate closedDate,
                                       DiseaseToReportDTO disease,
                                       Long patientPersonId,
                                       List<VisitToReportDTO> visits) {

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        AppealToReportServiceDTO that = (AppealToReportServiceDTO) o;
//        return appealId.equals(that.appealId) && openDate.equals(that.openDate) &&
//               Objects.equals(closedDate, that.closedDate) && patientPersonId.equals(that.patientPersonId) &&
//               appealStatus == that.appealStatus && disease.equals(that.disease) &&
//               insuranceType == that.insuranceType && visits.equals(that.visits);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = appealId.hashCode();
//        result = 31 * result + appealStatus.hashCode();
//        result = 31 * result + insuranceType.hashCode();
//        result = 31 * result + openDate.hashCode();
//        result = 31 * result + Objects.hashCode(closedDate);
//        result = 31 * result + disease.hashCode();
//        result = 31 * result + patientPersonId.hashCode();
//        result = 31 * result + visits.hashCode();
//        return result;
//    }
}