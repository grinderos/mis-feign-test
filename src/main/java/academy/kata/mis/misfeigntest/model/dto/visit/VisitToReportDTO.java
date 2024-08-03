package academy.kata.mis.misfeigntest.model.dto.visit;

import academy.kata.mis.misfeigntest.model.dto.service.MedicalServiceToReportDTO;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record VisitToReportDTO(Long id,
                               Long doctorId,
                               Long doctorPersonId,
                               Long doctorPositionId,
                               LocalDateTime visitTime,
                               List<MedicalServiceToReportDTO> medicalServiceToReportDTOs) {

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        VisitToReportDTO that = (VisitToReportDTO) o;
//        return id.equals(that.id) && doctorId.equals(that.doctorId) && doctorPersonId.equals(that.doctorPersonId) && doctorPositionId.equals(that.doctorPositionId) && visitTime.equals(that.visitTime) && medicalServiceToReportDTOs.equals(that.medicalServiceToReportDTOs);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id.hashCode();
//        result = 31 * result + doctorId.hashCode();
//        result = 31 * result + doctorPersonId.hashCode();
//        result = 31 * result + doctorPositionId.hashCode();
//        result = 31 * result + visitTime.hashCode();
//        result = 31 * result + medicalServiceToReportDTOs.hashCode();
//        return result;
//    }
}