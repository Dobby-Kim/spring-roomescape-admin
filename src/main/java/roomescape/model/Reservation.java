package roomescape.model;

public record Reservation(
        Long id,
        String name,
        String date,
        ReservationTime time) {
}
