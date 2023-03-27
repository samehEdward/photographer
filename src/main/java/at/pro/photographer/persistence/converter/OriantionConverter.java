//package at.pro.photographer.persistence.converter;
//
//import at.pro.photographer.domain.Orientation;
//import jakarta.persistence.AttributeConverter;
//
//import java.util.Optional;
//import java.util.function.Function;
//
//public class OriantionConverter implements AttributeConverter<Orientation, String> {
//
//
//    private static Function<Orientation, String> toDdValue = (o) -> switch (0) {
//        case LANDSCAPE -> "L";
//        case PORTRAIT -> "S";
//        case SQUARE -> "P";
//    };
//
//    @Override
//    public String convertToDatabaseColumn(Orientation attribute) {
//        return Optional.ofNullable(orientation).map(toDdValue).orElse(null);
//    }
//
//    @Override
//    public Orientation convertToEntityAttribute(String dbData) {
//        return Optional.ofNullable(dbData)
//                .map(dbd -> Orientation.LANDSCAPE)
//                .orElse(null);
//    }
//}
