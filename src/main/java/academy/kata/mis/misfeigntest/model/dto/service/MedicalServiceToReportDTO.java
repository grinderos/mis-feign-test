package academy.kata.mis.misfeigntest.model.dto.service;

import lombok.Builder;

@Builder
public record MedicalServiceToReportDTO(Long id,
                                        String name,
                                        Long medicalServiceDepId,
                                        Long visitId) {
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        MedicalServiceToReportDTO that = (MedicalServiceToReportDTO) o;
//        return id.equals(that.id) && name.equals(that.name) && visitId.equals(that.visitId) && medicalServiceDepId.equals(that.medicalServiceDepId);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id.hashCode();
//        result = 31 * result + name.hashCode();
//        result = 31 * result + medicalServiceDepId.hashCode();
//        result = 31 * result + visitId.hashCode();
//        return result;
//    }
}