class SpaceAge {

    private double seconds;
    private static final int EARTH_YEAR_IN_SECONDS = 31557600;
    private static final double MERCURY_EARTH_YEAR = 0.2408467;
    private static final double VENUS_EARTH_YEAR = 0.61519726;
    private static final double MARS_EARTH_YEAR = 1.8808158;
    private static final double JUPITER_EARTH_YEAR = 11.862615;
    private static final double SATURN_EARTH_YEAR = 29.447498;
    private static final double URANUS_EARTH_YEAR = 84.016846;
    private static final double NEPTUNE_EARTH_YEAR = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / EARTH_YEAR_IN_SECONDS;
    }

    double onMercury() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * MERCURY_EARTH_YEAR);
    }

    double onVenus() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * VENUS_EARTH_YEAR);
    }

    double onMars() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * MARS_EARTH_YEAR);
    }

    double onJupiter() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * JUPITER_EARTH_YEAR);
    }

    double onSaturn() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * SATURN_EARTH_YEAR);
    }

    double onUranus() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * URANUS_EARTH_YEAR);
    }

    double onNeptune() {
        return getSeconds() / (EARTH_YEAR_IN_SECONDS * NEPTUNE_EARTH_YEAR);
    }

}
