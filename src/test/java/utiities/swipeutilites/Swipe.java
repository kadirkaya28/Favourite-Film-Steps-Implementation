package utiities.swipeutilites;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Swipe {

    public enum Direction {
        DOWN, UP, LEFT, RIGHT;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public static Performable with(Direction direction) {
        switch (direction) {
          /*  case RIGHT:
                return instrumented(SwipeRight.class);*/
            case LEFT:
                return instrumented(SwipeLeft.class);
           /* case UP:
                return instrumented(SwipeUp.class);
            case DOWN:
                return instrumented(SwipeDown.class);*/
            default:
                throw new UnsupportedOperationException("Unsupported the direction " + direction);
        }
    }
}
