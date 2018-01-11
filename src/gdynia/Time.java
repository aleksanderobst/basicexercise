package gdynia;

public class Time {
    class ImmutableInt {
        private final int hour;

        public ImmutableInt(int i) {
            hour = i;
        }

        public int getValue() {
            return hour;
        }
    }



}
