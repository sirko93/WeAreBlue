package eu.execom.hackaton.beacon.model;

public class Location {

    private static final int SIGNAL_STRENGTH_STRONG = -60;
    private static final int SIGNAL_STRENGTH_WEAK = -90;
    private static final int RANGE = -(SIGNAL_STRENGTH_WEAK - SIGNAL_STRENGTH_STRONG);
    private static final String PROGRESS_CHARACTER = "I";

    public long id;

    public String uuid;

    public String description;

    public String name;

    public int signalStrength;

    @Override
    public String toString() {
        final int signalStrength = (int) getProgressValue() / 20;
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < signalStrength; i++) {
            stringBuilder.append(PROGRESS_CHARACTER);
        }

        return String.format("%-25s %s", uuid, stringBuilder.toString());
    }

    private double getProgressValue() {
        if (signalStrength >= SIGNAL_STRENGTH_STRONG) {
            return 100;
        } else if (signalStrength <= SIGNAL_STRENGTH_WEAK) {
            return 10;
        } else {
            final double percentage = (SIGNAL_STRENGTH_STRONG - signalStrength) / (double) RANGE;
            return (1 - percentage) * 100;
        }
    }

    public String getSignalStrength() {
        final int signalStrength = (int) getProgressValue() / 20;
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < signalStrength; i++) {
            stringBuilder.append(PROGRESS_CHARACTER);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location that = (Location) o;

        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }

}
