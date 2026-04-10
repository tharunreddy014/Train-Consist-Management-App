import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementUC8Test {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );
    }

    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 70)
                .collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 72)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 80)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 65),
                new Bogie("First Class", 80)
        );

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(3, result.size());
    }

    void testFilter_NoBogiesMatching() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 100)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("A", 80),
                new Bogie("B", 90)
        );

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

        void testFilter_EmptyBogieList() {
        List<Bogie> result = new ArrayList<Bogie>().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());

        List<Bogie> result = original.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(3, original.size()); // original unchanged
    }
}
