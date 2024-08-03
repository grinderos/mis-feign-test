package academy.kata.mis.misfeigntest.model.dto.disease;

import lombok.Builder;

@Builder
public record DiseaseToReportDTO(Long id, String name) {

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        DiseaseToReportDTO that = (DiseaseToReportDTO) o;
//        return id.equals(that.id) && name.equals(that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id.hashCode();
//        result = 31 * result + name.hashCode();
//        return result;
//    }
}
