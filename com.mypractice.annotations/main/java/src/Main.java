import proccessor.UseCaseTracker;
import util.PassUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static proccessor.UseCaseTracker.trackUseCases;

public class Main {
    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47,48,49,50);
        trackUseCases(useCases, PassUtils.class);
    }
}
