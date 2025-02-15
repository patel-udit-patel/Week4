import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.example.basic_junit_test.performance_testing_using_timeout.TaskUtils;
class TaskUtilsTest {

    TaskUtils taskUtils = new TaskUtils();

    @Test
    @Timeout(value = 2)  // Fail the test if the method takes more than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = taskUtils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}

