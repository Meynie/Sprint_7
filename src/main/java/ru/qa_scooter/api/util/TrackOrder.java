package ru.qa_scooter.api.util;

public class TrackOrder {
    public final String track;

    public TrackOrder(String track) {
        this.track = track;
    }

    public static TrackOrder getTrackOrder(int trackOrder) {
        final String track = String.valueOf(trackOrder);
        return new TrackOrder(track);
    }

    @Override
    public String toString() {
        return "TrackOrder{" +
                "track='" + track + '\'' +
                '}';
    }
}
