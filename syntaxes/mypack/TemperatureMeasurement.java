package mypack;

import java.time.LocalDateTime;

public record TemperatureMeasurement(
        String stationName,
        float recordedTemparature,
        LocalDateTime recordedAt
    ) {
}