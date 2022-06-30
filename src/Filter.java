import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> sours) {
        Logger logger = Logger.getInstance();
        List<Integer> results = new ArrayList<>();
        int f = 0;
        for (int i : sours) {
            if (i >= threshold) {
                logger.log("Element " + "'" + i + "'" + " passes.");
                results.add(i);
                f++;
            } else {
                logger.log("Element " + "'" + i + "'" + " does not pass.");
            }

        }
        logger.log("Passed filter " + f + " items out of " + sours.size());
        return results;
    }
}
