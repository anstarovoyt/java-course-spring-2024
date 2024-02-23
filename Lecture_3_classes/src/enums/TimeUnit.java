package enums;

public enum TimeUnit {

    NANOSECONDS(1) {
        @Override
        String prefix() {
            return "ns";
        }
    },
    MICROSECONDS(1000) {
        @Override
        String prefix() {
            return "μs";
        }
    },
    MILLISECONDS(1000 * 1000) {
        @Override
        String prefix() {
            return "ms";
        }
    },
    SECONDS(1000 * 1000 * 1000) {
        @Override
        String prefix() {
            return "s";
        }
    },
    MINUTES(60L * 1000 * 1000 * 1000L) {
        @Override
        String prefix() {
            return "min";
        }
    },
    HOURS(60L * 60 * 1000 * 1000 * 1000) {
        @Override
        String prefix() {
            return "h";
        }
    },
    DAYS(24L * 60 * 60 * 1000 * 1000 * 1000) {
        @Override
        String prefix() {
            return "d";
        }
    };

    private final long nanoseconds;

    TimeUnit(long multiplier) {
        nanoseconds = multiplier;
    }

    public final long toNanoseconds() {
        return nanoseconds;
    }

    abstract String prefix();
}

class TimeUnitMain {
    public static void main(String[] args) {
        System.out.println(TimeUnit.DAYS.toNanoseconds());

        // TimeUnit days = TimeUnit.valueOf("DAYS");
        // System.out.println(days);
    }
}
