package tk.tcomad.unibot.telegram;

import java.util.Arrays;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Callback {

    LECTURE("/Lecture"),
    TASK("/Task"),
    STUDENT("/Student"),
    TEACHER("/Teacher"),
    DAY("/Day");

    private final String message;

    public static Optional<Callback> fromCallbackText(String callback) {
        return Arrays.stream(Callback.values())
                     .filter(value -> value.getMessage().equals(callback))
                     .findFirst();
    }
}
